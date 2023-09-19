package Date_Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.SimpleTimeZone;

public class ExampleDate2 {
    public static void main(String[] args) throws ParseException {
        //init object Date
        Date date1 = new Date();
        System.out.println(date1);


        Date date2 = new Date(1695098299508l);
        System.out.println(date2);

        //method int compareTo()
        System.out.println(date1.compareTo(date2));

        //method boolean equals()
        System.out.println(date1.equals(date2));

        //method clone()
        Date date3 = (Date) date1.clone();
        System.out.println(date3);

        //method getTime()
        System.out.println(date1.getTime());

        //
        Instant instant = Instant.now();
        System.out.println(instant);
        Date date4 = Date.from(instant);
        System.out.println(date4);

        //
        String date1String = date1.toString();
        System.out.println(date1String + " Bee");

        //init object SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
        System.out.println(sdf.format(date1));

        //convert String to Date
        Date date5 =  sdf.parse("20-Aug-2023 07:08");
        System.out.println(date5);
    }
}
