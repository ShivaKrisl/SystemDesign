import java.time.LocalDate;
import java.time.LocalDateTime;

public class Segment {
    private final String from;
    private final String to;
    private final LocalDate departAt;
    private final LocalDate arriveAt;

    public Segment(String from, String to, LocalDate departAt, LocalDate arriveAt) {
        this.from = from;
        this.to = to;
        this.departAt = departAt;
        this.arriveAt = arriveAt;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDate getDepartAt() {
        return departAt;
    }

    public LocalDate getArriveAt() {
        return arriveAt;
    }

    @Override
    public String toString() {
        return String.format("Segment{%s -> %s, depart: %s, arrive: %s}", 
                           from, to, departAt, arriveAt);
    }

}
