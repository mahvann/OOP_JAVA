package BTVN1_JAVABACKEND;

class MenoryManagement{  //Method area
    int var1 = 1; //Heap Area  //Biến instance
    double var2 = 2; //Heap Area  //Biến instance
    String var3 = "hello"; //Heap area  //Biến instance
    String var4 = new String("Hello"); //Khi dùng từ khóa new tạo một đối tượng mới thì đối tượng này String lưu trong bộ nhớ Heap
                                                // biến var4 được lưu trong Stack trỏ đến đối tượng này
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
    // Khi thực hiện chương trình java tìm đến hàm main và hàm main được khởi tạo trong bộ nhớ Stack
    public static void main(String [] args){ //Method area
        int n = 10; //Biến local được khởi tạo và lưu ở Stack
        System.out.println("Hello World");


        MenoryManagement var13 = new MenoryManagement(); //Khi dùng từ khóa new tạo một đối tượng mới thì đối tượng này MenoryManagement lưu trong bộ nhớ Heap
        //Biến tam chiếu var13 nằm trong bộ nhớ Stack trỏ đến đối tượng MenoryManagement
        var13.myMethod1(14,15);
        //Hàm myMethod1() được gọi và lưu trong bộ nhớ Stack
        //Biến var8, var9 là biến local nên được lưu trong Stack
    }
}
