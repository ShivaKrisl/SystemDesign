import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Product{
    // Required parameters
    private String travelerName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String origin;
    private String destination;

    // Optional parameters with Defaults
    private List<Segment> segments;
    private HashSet<String> Label;
    private double moneyValue;
    private boolean travelInsurance;

    private Product(Builder builder){
        this.travelerName = builder.travelerName;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.origin = builder.origin;
        this.destination = builder.destination;
        // Defensive copying for mutable collections
        this.segments = builder.segments != null ? new ArrayList<>(builder.segments) : new ArrayList<>();
        this.Label = builder.Label != null ? new HashSet<>(builder.Label) : new HashSet<>();
        
        this.moneyValue = builder.moneyValue;
        this.travelInsurance = builder.travelInsurance;
    }

    public static class Builder{
        private String travelerName;
        private LocalDate startDate;
        private LocalDate endDate;
        private String origin;
        private String destination;
        private List<Segment> segments = new ArrayList<>();
        private HashSet<String> Label = new HashSet<>();
        private double moneyValue = 0.0;
        private boolean travelInsurance = false;

        Builder setTravelerName(String travelerName){
            if(travelerName == null || travelerName.isEmpty()){
                throw new IllegalArgumentException("Traveler name cannot be null or empty");
            }
            this.travelerName = travelerName;
            return this;
        }

        Builder setStartDate(LocalDate startDate){
            if(startDate == null){
                throw new IllegalArgumentException("Start date cannot be null");
            }
            this.startDate = startDate;
            return this;
        }

        Builder setEndDate(LocalDate endDate){
            if(endDate == null){
                throw new IllegalArgumentException("End date cannot be null");
            }
            if(startDate == null || endDate.isBefore(this.startDate)){
                throw new IllegalArgumentException("End date cannot be before start date");
            }
            this.endDate = endDate;
            return this;
        }

        Builder setOrigin(String origin){
            if(origin == null || origin.isEmpty() || origin.length() != 3){
                throw new IllegalArgumentException("Origin must be a valid 3-letter airport code");
            }
            this.origin = origin;
            return this;
        }

        Builder setDestination(String destination){
            if(destination == null || destination.isEmpty() || destination.length() != 3){
                throw new IllegalArgumentException("Destination must be a valid 3-letter airport code");
            }
            this.destination = destination;
            return this;
        }

        Builder segment(List<Segment> segments){
            if(segments != null){
                // Defensive copy
                this.segments = new ArrayList<>(segments);
            }
            return this;
        }

        Builder addSegment(Segment segment){
            if(segment != null){
                this.segments.add(segment);
            }
            return this;
        }

        Builder label(HashSet<String> Label){
            if(Label != null){
                // Defensive copy
                this.Label = new HashSet<>(Label);
            }
            return this;
        }

        Builder addLabel(String label){
            if(label != null){
                this.Label.add(label);
            }
            return this;
        }

        Builder moneyValue(double moneyValue){
            if(moneyValue < 0){
                throw new IllegalArgumentException("Money value cannot be negative");
            }
            this.moneyValue = moneyValue;
            return this;
        }

        Builder travelInsurance(boolean travelInsurance){
            this.travelInsurance = travelInsurance;
            return this;
        }

        // Convenience method for Weekend Gateway
        Builder weekendGetaway(String origin, String destination){
            LocalDate nextSaturday = getNextSaturday();
            return this.setOrigin(origin)
                       .setDestination(destination)
                       .setStartDate(nextSaturday)
                       .setEndDate(nextSaturday.plusDays(2))
                       .addLabel("weekend");
        }

        private LocalDate getNextSaturday(){
            LocalDate today = LocalDate.now();
            int daysUntilSaturday = (6 - today.getDayOfWeek().getValue() + 7) % 7;
            daysUntilSaturday = daysUntilSaturday == 0 ? 7 : daysUntilSaturday; // Ensure it's next Saturday
            return today.plusDays(daysUntilSaturday);
        }

        // Build method to construct the final Product object
        Product build(){
            validateBusinessRules();
            return new Product(this);
        }

        private void validateBusinessRules(){
            // We already have written validations for each setter but still you can add extensive validations here

            if (!segments.isEmpty()) {
                validateSegments();
            }
        }

        private void validateSegments(){
            // 1. Chronological Order
            for(int i = 0; i < this.segments.size()-1; i++){
                LocalDate currDepartDate = this.segments.get(i).getDepartAt();
                LocalDate nextDepartDate = this.segments.get(i+1).getDepartAt();
                if(currDepartDate.isAfter(nextDepartDate)){
                    throw new IllegalStateException(
                        String.format("Segments not in chronological order at index %d (%s before %s)", 
                                    i + 1, nextDepartDate, currDepartDate));
                }
            }

            // 2. Continuity - each segment's 'to' should match next segment's 'from'
            for(int i = 0; i < this.segments.size() - 1; i++){
                String currTo = this.segments.get(i).getTo();
                String nextFrom = this.segments.get(i + 1).getFrom();
                if(!currTo.equals(nextFrom)){
                    throw new IllegalStateException(
                        String.format("Segments not continuous between index %d and %d (%s != %s)", 
                                    i, i + 1, currTo, nextFrom));
                }
            }

            // 3. Endpoints validation
            String firstFrom = this.segments.get(0).getFrom();
            String lastTo = this.segments.get(this.segments.size() - 1).getTo();
            if(!firstFrom.equals(this.origin)){
                throw new IllegalStateException(
                    String.format("First segment 'from' (%s) does not match itinerary origin (%s)", 
                                firstFrom, this.origin));
            }
            if(!lastTo.equals(this.destination)){
                throw new IllegalStateException(
                    String.format("Last segment 'to' (%s) does not match itinerary destination (%s)", 
                                lastTo, this.destination));
            }
        }
    }

    // Sample getters and toString for demonstration
    @Override
    public String toString() {
        return String.format("Itinerary{traveler='%s', %s->%s, %s to %s, segments=%d, budget=%.2f, insurance=%s}", 
                           travelerName, origin, destination, startDate, endDate, 
                           segments == null ? 0 : segments.size(), moneyValue, travelInsurance);
    }
}