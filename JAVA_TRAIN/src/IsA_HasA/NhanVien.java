package IsA_HasA;

public class NhanVien extends Nguoi{
    public DiaChi diaChiLamViec;

    public DiaChi getDiaChiLamViec() {
        return diaChiLamViec;
    }

    public void setDiaChiLamViec(DiaChi diaChiLamViec) {
        this.diaChiLamViec = diaChiLamViec;
    }
    @Override
    public void lamViec(){
        System.out.println("Noi lam viec " + diaChiLamViec);
    }
}
