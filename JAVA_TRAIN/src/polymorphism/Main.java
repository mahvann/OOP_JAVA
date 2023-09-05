package polymorphism;

class TinhToan{
    public int cong(int a,int b){
        return a + b;
    }
    public int cong(int a,int b, int c){
        return a + b + c;
    }
    public float cong(float a, float b){
        return a + b;
    }
}
public class Main {
    public static void main(String[] args) {
        TinhToan tinh = new TinhToan();
        System.out.println("1 + 2 = " + tinh.cong(1,2));
        System.out.println("1 + 2 + 3 = " + tinh.cong(1,2,3));
        System.out.println("1.1 + 2.2 = "+ String.format("%.2f",tinh.cong(1.1f,2.2f)) );
    }
}
