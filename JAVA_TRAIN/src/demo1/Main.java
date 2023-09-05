package demo1;
// Truyền tham chiếu(truyền địa chỉ)
public class Main {
    public void swap(Dog a, Dog b){
        String x = a.name;
        a.name = b.name;
        b.name = x;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Dog a = new Dog("Mickey");
        Dog b = new Dog("Muc");
        main.swap(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
