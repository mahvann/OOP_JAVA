package java8;
interface Sayable1{
    public void say();
}
public class MethodReferencesExample2 {
    public static void doSomething(){
        System.out.println("Hello, this is static method");
    }
    public static void main(String[] args) {
        //Reference to static method (Class::staticMethod)
        Sayable1 s1 = MethodReferencesExample2::doSomething;

        Sayable1 s2 = ()->doSomething();
        //Call interface method
        s1.say();
        s2.say();
    }
}
