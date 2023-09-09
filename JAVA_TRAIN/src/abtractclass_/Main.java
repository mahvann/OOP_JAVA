package abtractclass_;

interface DongVatCaSi{
    void hat();
}

interface DongVatCoCanh{
    void tocDo();
    default void noi(){
        System.out.println("Dong vat co canh noi");
    }
}

abstract class DongVat {
    public void ngu(){ //Phương thức cụ thể
        System.out.println("Dong vat dang ngu");
    }
    public void noi(){
        System.out.println("Dong vat noi");
    } //Phương thức trừu tượng
}
class Meo extends DongVat{
    @Override
    public void noi(){
        System.out.println("Meo meo");
    }
}
class HoaMi implements DongVatCaSi,DongVatCoCanh{
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
//        DongVat dongVat = new Meo();
//        dongVat.ngu();
//
//        HoaMi hoaMi = new HoaMi();
//        hoaMi.hat();
//        hoaMi.noi();
//        hoaMi.tocDo();
        //DongVat hm1 = new HoaMi();
        DongVatCoCanh hm2 = new HoaMi();
       // hm1.noi();
        hm2.noi();
    }
}
