package Keyword_static;
class Counter {
    static int count = 0; // Biến tĩnh

    public Counter() {
        count++; // Mỗi khi tạo một đối tượng, biến tĩnh count tăng lên
    }

    public static void printCount() {
        System.out.println("So doi tuong duoc tao: " + count);
    }
}
public class StaticVariables {



        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();

            Counter.printCount(); // In ra số lượng thể hiện đã được tạo
        }
}
