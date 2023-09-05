package String;

public class Main {
    public static void main(String[] args) {
        String str1 = "EC";
        String str2 = new String("EC");
        String internedString = str2.intern();
        System.out.println(str1 == internedString);

    }
}
