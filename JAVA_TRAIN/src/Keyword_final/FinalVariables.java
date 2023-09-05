package Keyword_final;
class MyWebsite{
    private String website;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
public class FinalVariables {
    public static void main(String[] args) {
        final MyWebsite myWebsite = new MyWebsite();
        myWebsite.setWebsite("manhvann.com");
        System.out.println(myWebsite.getWebsite());
        //myWebsite = new MyWebsite(); //Lỗi
    }
}
