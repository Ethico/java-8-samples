import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by hrushikeshp on 11/15/2016.
 */
public class DateApi {
    public static void main(String[] args) {
        LocalTime now1=LocalTime.now();
        LocalTime now2=LocalTime.now();

        System.out.println(now1.isBefore(now2));

        LocalDate today = LocalDate.now();
        LocalDate tommorow = today.plus(1, ChronoUnit.DAYS);
        System.out.println(today);
        System.out.println(tommorow);



    }
}
