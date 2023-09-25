package Date_Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class test {
        private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        public static void main(String[] args) {
            Runnable task = () -> {
                try {
                    LocalDate date = LocalDate.parse("2023-09-20",sdf);
                    System.out.println("Parsed date: " + date);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            };

            Thread thread1 = new Thread(task);
            Thread thread2 = new Thread(task);

            thread1.start();
            thread2.start();
        }
}
