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
        System.out.println("getTime(): " + date1.getTime());


        //
        String date1String = date1.toString();
        System.out.println(date1String + " Bee");

        //init object SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("sdf: " + sdf.format(date1));

        //convert String to Date with SimpleDateFormat
        Date date5 =  sdf.parse("20-09-2023 07:08:59");
        System.out.println(date5);
    }
}
