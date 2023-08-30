package Keyword_static;

class InitializationExample {
    static int value;

    static {
        System.out.println("Static block is executed.");
        value = 10; // Khởi tạo giá trị cho biến tĩnh
    }

    static void printValue() {
        System.out.println("Value: " + value);
    }
}
public class static_block {
    public static void main(String[] args) {
        InitializationExample.printValue(); // Gọi phương thức tĩnh
    }
}
