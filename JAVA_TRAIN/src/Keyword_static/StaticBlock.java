package Keyword_static;
class Example {
    static int value;

    static {
        System.out.println("Static block is executed.");
        value = 10; // Khởi tạo giá trị cho biến tĩnh
    }

    static void printValue() {
        System.out.println("Value: " + value);
    }
}
public class StaticBlock {
        public static void main(String[] args) {
           Example.printValue(); // Gọi phương thức tĩnh
        }
}
