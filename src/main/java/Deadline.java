import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Deadline extends Task {
    LocalDate date;
    LocalTime time;

    Deadline(String task, LocalDate date, LocalTime time) {
        super(task);
        this.date = date;
        this.time = time;
    }

    public static Deadline of(String task, String inputDate, String inputTime) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);
            LocalTime time = LocalTime.parse(inputTime, DateTimeFormatter.ISO_LOCAL_TIME);
            return new Deadline(task, date, time);
        } catch (DateTimeException e) {
            System.out.println("    ERROR: Duke doesn't recognise the date/time -> " 
                + inputDate + " " + inputTime);
        }
        return null;
    }

    public static Deadline of(String task, String inputDate, String inputTime, boolean done) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);
            LocalTime time = LocalTime.parse(inputTime, DateTimeFormatter.ISO_LOCAL_TIME);
            Deadline deadline = new Deadline(task, date, time);
            if (done) {
                deadline.setDone();
            }
            return deadline;
        } catch (DateTimeException e) {
            System.out.println("    ERROR: Duke doesn't recognise the date/time -> "
                    + inputDate + " " + inputTime);
        }
        return null;
    }

    @Override
    public String toDataString() {
        return "D // " + (done ? "1": "0") + " // " + task + " // "
            + date.format(DateTimeFormatter.ISO_LOCAL_DATE) + " // "
            + time.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }
    
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: "
            + this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))
            + " " + this.time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT))
            + ")";
    }
}
