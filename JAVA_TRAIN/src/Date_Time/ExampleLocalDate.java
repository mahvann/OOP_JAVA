package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ExampleLocalDate {
    public static void main(String[] args) {
        System.out.println("Hello");
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        FormatStyle fs = FormatStyle.FULL;
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        System.out.println(ld.format(dtf));
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //Fomartter

    }
}
