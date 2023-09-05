package Keyword_this;
class A{
    PassArgumentInConstructor obj;
    public A(PassArgumentInConstructor obj){
        this.obj = obj;
    }
    void diplay(){
        System.out.println(obj.a);
    }
}
public class PassArgumentInConstructor {
    int a = 10;

    public PassArgumentInConstructor() {
        A a =new A(this);
        a.diplay();
        System.out.println("Call empty constructor ");
    }

    public static void main(String[] args) {
        new PassArgumentInConstructor();
    }
}
