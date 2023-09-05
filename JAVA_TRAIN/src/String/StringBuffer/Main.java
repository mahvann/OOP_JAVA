package String.StringBuffer;

public class Main {
    public static void main(String[] args) {
//        long start = System.nanoTime();
//
//        String s = "Hello";
//        for (int i = 0; i<1000; i++){
//            s += "word";
//        }
//        long end = System.nanoTime();
//        System.out.println("Thoi gian: " + (end - start) + " ns");


        long start = System.nanoTime();

        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i<1000; i++){
            sb.append("word");
        }
        String s = sb.toString();
        long end = System.nanoTime();
        System.out.println("Thoi gian: " + (end - start) + " ns");
    }
}
