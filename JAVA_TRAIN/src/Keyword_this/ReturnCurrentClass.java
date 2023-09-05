package Keyword_this;

public class ReturnCurrentClass {
    public ReturnCurrentClass in(){
        return this;
    }

    public static void main(String[] args) {
        ReturnCurrentClass returnCurrentClass = new ReturnCurrentClass();
        System.out.println(returnCurrentClass);
        System.out.println(returnCurrentClass.in());
    }
}
