package IsA_HasA;

public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.setTen("Manh");

        DiaChi dc = new DiaChi();
        dc.setTenDuong("Hanoi");

        nv.setDiaChiLamViec(dc);

        System.out.println(nv.getTen());
        nv.lamViec();
    }
}
