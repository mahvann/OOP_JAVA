package Date_Time;

public class ExampleDate {
    public static void main(String[] args) {
        //Get the current time
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++ ){
            System.out.println("ExampleDate");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Time befor: " + t1 + " milisecond");
        System.out.println("Time befor: " + t2 + " milisecond");
        System.out.println("time: " + (t2-t1) + " milisecond");
        System.out.println("time: " + (t2-t1)/1000 + " second");
    }
}
