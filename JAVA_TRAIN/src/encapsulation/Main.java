package encapsulation;
class Meo{
    private String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
public class Main {
    public static void main(String[] args) {
        Meo meo = new Meo();
        meo.setTen("mimi");
        System.out.println(meo.getTen());
    }
}
