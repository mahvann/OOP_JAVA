package Keyword_static;
class MathUtils {
    static int multiplier = 2; // Biến tĩnh

    static int multiply(int number) {
        return number * multiplier;
    }

    static void setMultiplier(int value) {
        multiplier = value;
    }
}
public class StaticMethods {
        public static void main(String[] args) {
            int result = MathUtils.multiply(5); // Gọi phương thức tĩnh mà không cần tạo đối tượng
            System.out.println("Result: " + result); // Kết quả: 10

            MathUtils.setMultiplier(3); // Thiết lập giá trị mới cho biến tĩnh

            result = MathUtils.multiply(5); // Gọi lại phương thức tĩnh với giá trị biến tĩnh đã thay đổi
            System.out.println("Result: " + result); // Kết quả: 15
        }
}
