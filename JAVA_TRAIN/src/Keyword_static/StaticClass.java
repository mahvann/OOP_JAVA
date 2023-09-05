package Keyword_static;
class MonHoc{
    private String tenMonHoc;

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }
    static class Website{
        public static String ws = "manhvann.com";

    }
    public void in(){
        System.out.println("Mon hoc: " + tenMonHoc);
        System.out.println("Website: " + Website.ws);
    }
}
public class StaticClass {
    public static void main(String[] args) {
        System.out.println(MonHoc.Website.ws);
        MonHoc mh = new MonHoc();
        mh.setTenMonHoc("Toan");
        mh.in();

    }
}
