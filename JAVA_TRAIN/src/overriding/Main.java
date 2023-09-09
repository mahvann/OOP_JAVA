package overriding;
class Nguoi{

    public void thongTin(){
        System.out.println("Class cha");
    }
}
class NhanVien extends Nguoi{
    @Override
    public void thongTin(){
        System.out.println("Class con");
    }
}
class ThucTap extends NhanVien{
    public void thongTin(){
        System.out.println("Class cháu");
    }
}
public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        Nguoi ng = new NhanVien();

        //ng.setLuong(13.5);  //Lỗi compile time --> Ko gọi được phương thức của con

        nv.thongTin();
        ng.thongTin();

        ThucTap thucTap = new ThucTap();
        thucTap.thongTin();

    }
}
