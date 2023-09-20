package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ExampleLocalDate {
    public static void main(String[] args) {
        System.out.println("-----------------------LocalDate---------------------------");
        // init LocalDate with static method
        LocalDate lD = LocalDate.now();
        System.out.println(lD);

        //init and print object LocalDate with static method of()
        LocalDate lD1 = LocalDate.of(2023, 9, 20);
        System.out.println(lD1);

        //increase and decrease Days, Months, Years with method plus, minus
        LocalDate ld3 = lD1.minusDays(2);
        System.out.println(ld3);

        //method getMonth(), getMonthValue(), getDayofMonth()
        // getDayofWeek(),getDayofYear(), getYear()
        System.out.println(lD.getMonth());


        //init object DataTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        //print with format
        System.out.println(lD.format(dtf));

        //convert String to LocalDate with DateTimeFormetter
        String strDate = "20-09-2023";
        LocalDate lD2 = LocalDate.parse(strDate,dtf);
        System.out.println(lD2);

        // method withMonth(), withDay(), withYear()
        LocalDate newDate = lD2.withMonth(12).withYear(2022);
        System.out.println(newDate);

        System.out.println("-----------------------LocalTime---------------------------");
        //init LocalTime
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        System.out.println("-----------------------LocalDateTime-----------------------");
        //init object LocalDateTime
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //convert LocalDateTime to String with method format
        String lDTString = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(lDTString);




    }
}
