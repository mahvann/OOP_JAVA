package class_object;

public class Nguoi {
    private String ten;
    private String tuoi;
    public void chao(String ten){
        System.out.println("Hello ca nha!!\nMinh ten la " + ten );
    }

    public static void main(String[] args) {
        new Nguoi(); //Doi tuong 1
        Nguoi nguoiA = new Nguoi(); //doi tuong 2
        Nguoi nguoiB = new Nguoi(); //doi tuong 3

        new Nguoi().chao("Anonymous object"); //doi tuong 4
        nguoiA.chao("Manh");
        nguoiB.chao("Toan");
    }
}
