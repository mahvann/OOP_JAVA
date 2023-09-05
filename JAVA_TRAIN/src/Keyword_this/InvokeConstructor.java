package Keyword_this;

public class InvokeConstructor {
    int a;
    public InvokeConstructor() {
        System.out.println("Ham tao rong");
    }

    public InvokeConstructor(int a) {
        this();
        this.a = a;
    }

    public static void main(String[] args) {
        InvokeConstructor invokeConstructor = new InvokeConstructor();
    }
}
