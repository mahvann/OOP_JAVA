package Date_Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
        private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        public static void main(String[] args) {
            Runnable task = () -> {
                try {
                    Date date = sdf.parse("2023-09-20");
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
