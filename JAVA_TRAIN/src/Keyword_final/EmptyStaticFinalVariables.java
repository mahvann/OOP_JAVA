package Keyword_final;

import com.sun.security.jgss.GSSUtil;

class UsingFinal{
    protected static final String website;
    static {
        website = "manhvann.com";
    }
    static {
        //website = "manh193.com"; //Lỗi
    }
    public UsingFinal() {
    }
}
public class EmptyStaticFinalVariables {
    public static void main(String[] args) {
        System.out.println(UsingFinal.website);
    }

}
