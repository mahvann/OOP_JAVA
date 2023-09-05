package Keyword_this;

public class PassArgumentInMethod {
    int a = 10;
    void m(PassArgumentInMethod passArgumentInMethod){
        passArgumentInMethod.a = 100;
        System.out.println("Method invoked");
    }
    void p(){
        m(this);
        System.out.println("Call p");
    }

    public static void main(String[] args) {
        new PassArgumentInMethod().p();
    }
}
