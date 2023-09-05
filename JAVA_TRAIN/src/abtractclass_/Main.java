package abtractclass_;

interface DongVatCaSi{
    void hat();
}

interface DongVatCoCanh{
    void tocDo();
}

abstract class DongVat {
    public void ngu(){ //Phương thức cụ thể
        System.out.println("Dong vat dang ngu");
    }
    public abstract void noi(); //Phương thức trừu tượng
}
class Meo extends DongVat{
    @Override
    public void noi(){
        System.out.println("Meo meo");
    }
}
class HoaMi extends DongVat implements DongVatCaSi,DongVatCoCanh{
    @Override
    public void hat(){
        System.out.println("liu lo");
    }

    @Override
    public void noi() {
        System.out.println("la la la");
    }

    @Override
    public void tocDo() {
        System.out.println("toc do 24 km/h");
    }
}
public class Main {
    public static void main(String[] args) {
        //DongVat dongVat = new DongVat(); //không khởi tạo được lớp truu tượng
        DongVat dongVat = new Meo();
        dongVat.ngu();

        HoaMi hoaMi = new HoaMi();
        hoaMi.hat();
        hoaMi.noi();
        hoaMi.tocDo();
    }
}
