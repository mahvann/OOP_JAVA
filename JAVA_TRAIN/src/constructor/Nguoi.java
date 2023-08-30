package constructor;

public class Nguoi extends Vuon{
    protected String ten;
    protected int tuoi;
    Nguoi(){
        System.out.println("Day la class Nguoi");
    }
    Nguoi(String ten, int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public void chao(){
        System.out.println("Hello");
    }
}
