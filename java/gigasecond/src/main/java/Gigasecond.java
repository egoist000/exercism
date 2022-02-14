import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime ldt;

    public Gigasecond(LocalDate moment) {
        this.ldt = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.ldt = moment;
    }

    public LocalDateTime getDateTime() {
        return this.ldt.plusSeconds((long)Math.pow(10, 9));
    }
}
