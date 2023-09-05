package demo;

import javax.swing.*;

public class HinhVuong {
    public static int dem = 0;
    private int chieuDai;
    public HinhVuong(int chieuDai){
        this.chieuDai = chieuDai;
        //dem = dem + 1;
    }
    static {
        dem = dem + 1;
        dem = dem + 1;
    }
    public static int dienTich(int doDaiCanh){
        return doDaiCanh * doDaiCanh;

    }

}
