package BTVN1_JAVABACKEND;

class MenoryManagement{
    int var1 = 1;
    double var2 = 2;
    String var3 = "hello";
    String var4 = new String("Hello");
    static int var5 = 12;
    static String var6 = "var6";
    static String var7 = new String("var7");

    void myMethod1(int var8, int var9){
        int var10 = 12;
        String var11 =  "var11";
        String var12 = new String("var12");
    }
}
public class Main {
    public static void main(String [] args){
        System.out.println("Hello World");
        MenoryManagement var13 = new MenoryManagement();
        var13.myMethod1(14,15);
        
    }
}
