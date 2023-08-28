package BTVN1_JAVABACKEND;

class MenoryManagement{  //Method area
    int var1 = 1; //Heap Area  //Biến instance
    double var2 = 2; //Heap Area  //Biến instance
    String var3 = "hello"; //Heap area  //Biến instance
    String var4 = new String("Hello"); //Heap area  //Biến instance
    static int var5 = 12; //Method area  //Biến static
    static String var6 = "var6"; //Method area  //Biến static
    static String var7 = new String("var7"); //Method area  //Biến static

    void myMethod1(int var8 , int var9){ //Stack Area
        int var10 = 12; //Stack Area    //Biến local
        String var11 =  "var11"; //Stack Area    //Biến local
        String var12 = new String("var12"); //Stack Area    //Biến local
    }
}
public class Main {
    public static void main(String [] args){ //Method area
        int n = 10; //Biến local
        System.out.println("Hello World");
        MenoryManagement var13 = new MenoryManagement(); //Heap area
        var13.myMethod1(14,15);
        System.out.println("Hello");
    }
}
