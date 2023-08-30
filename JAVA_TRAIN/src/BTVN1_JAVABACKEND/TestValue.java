package BTVN1_JAVABACKEND;

public class TestValue {
    public static void change(Integer x){
        x = x+1;
        //Thực chất đang tạo ra một biến mới trỏ đến object Integer và x = x + 1 chỉ thay đổi biến mới này mà ko thay dổi được biến ban đầu
    }

    public static void main(String[] args) {
        Integer x = 1;
        System.out.println("Trước khi change = "+ x);
        change(x);
        System.out.println("Sau khi change = " + x);
    }
}
