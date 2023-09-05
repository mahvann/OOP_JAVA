package overriding;
class Nguoi{
    protected String ten;

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }
    public void thongTin(){
        System.out.println("Class cha");
    }
}
class NhanVien extends Nguoi{
    protected double luong;

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }
    @Override
    public void thongTin(){
        System.out.println("Class con");
    }
}
class ThucTap extends NhanVien{
//    public void thongTin(){
//        System.out.println("Class cháu");
//    }
}
public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        Nguoi ng = new NhanVien();
        nv.setLuong(12.5);
        nv.setTen("Manh");

        ng.setTen("Toan");
        //ng.setLuong(13.5);  //Lỗi compile time --> Ko gọi được phương thức của con

        nv.thongTin();
        ng.thongTin();

        ThucTap thucTap = new ThucTap();
        thucTap.thongTin();

    }
}
