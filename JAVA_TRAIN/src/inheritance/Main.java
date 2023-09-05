package inheritance;
class DongVat{
    protected String ten;

    public DongVat() {
    }

    public DongVat(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}

class Meo extends DongVat{
    protected String noi;
    public Meo(){

    }

    public Meo(String noi) {
        this.noi = noi;
    }

    public Meo(String ten, String noi) {
        super(ten);
        this.noi = noi;
    }

    public void setNoi(String noi) {
        this.noi = noi;
    }

    public String getNoi() {
        return noi;
    }
}
class MeoTa extends Meo{
    private float trongLuong;

    public MeoTa() {
    }

    public MeoTa(float trongLuong) {
        this.trongLuong = trongLuong;
    }

    public MeoTa(String noi, float trongLuong) {
        super(noi);
        this.trongLuong = trongLuong;
    }

    public MeoTa(String ten, String noi, float trongLuong) {
        super(ten, noi);
        this.trongLuong = trongLuong;
    }

    public void setTrongLuong(float trongLuong) {
        this.trongLuong = trongLuong;
    }

    public float getTrongLuong() {
        return trongLuong;
    }
}
class Cho extends DongVat{
    private String noi;

    public Cho() {
    }

    public Cho(String noi) {
        this.noi = noi;
    }

    public Cho(String ten, String noi) {
        super(ten);
        this.noi = noi;
    }

    public void setNoi(String noi) {
        this.noi = noi;
    }

    public String getNoi() {
        return noi;
    }
}
public class Main {
    public static void main(String[] args) {
        Meo meo = new Meo("mimi","meo meo");
        System.out.println("Ten cua meo " + meo.getTen());

        MeoTa meoTa = new MeoTa("mun","meo meo",2.5f);
        System.out.println("Trong luong cua meo ta " + meoTa.getTrongLuong() + "kg");

    }
}
