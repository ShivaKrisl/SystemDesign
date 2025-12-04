import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        // 1. Basic Itinerary
        Product itinerary1 = new Product.Builder()
                             .setTravelerName("Alice")
                             .setStartDate(LocalDate.of(2025, 12, 01))
                             .setEndDate(LocalDate.of(2025, 12, 04))
                             .setOrigin("NYC")
                             .setDestination("SEA")
                             .build();

        System.out.println("Itinerary 1 created successfully. -  " + itinerary1.toString());
    
        // 2. Weekend Getaway Itinerary
        Product itinerary2 = new Product.Builder()
                             .weekendGetaway("LAX", "SFO")
                             .setTravelerName("Bob")
                             .moneyValue(500.0)
                             .travelInsurance(true)
                             .build();
        System.out.println("Itinerary 2 created successfully. -  " + itinerary2.toString());

        // 3. Itinerary with Segments and Labels
        Segment segment1 = new Segment("NYC", "CHI", LocalDate.of(2025, 12, 01), LocalDate.of(2025, 12, 01));
        Segment segment2 = new Segment("CHI", "SEA", LocalDate.of(2025, 12, 02), LocalDate.of(2025, 12, 03));
        Product itinerary3 = new Product.Builder()
                             .setTravelerName("Charlie")
                             .setStartDate(LocalDate.of(2025, 12, 01))
                             .setEndDate(LocalDate.of(2025, 12, 03))
                             .setOrigin("NYC")
                             .setDestination("SEA")
                             .addSegment(segment1)
                             .addSegment(segment2)
                             .addLabel("business")
                             .moneyValue(1200.0)
                             .travelInsurance(true)
                             .build();
        System.out.println("Itinerary 3 created successfully. -  " + itinerary3.toString());
    }
}
