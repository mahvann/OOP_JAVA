package java8;

//functional interface
interface Sayable{
    public String say();
}
interface Sayable2{
    public void say(String a,String b);
}
public class LambdaExample2 {
    public static void main(String[] args) {
        Sayable s = () ->{
            return "Hello Viet Nam";
        };
        System.out.println(s.say());


        Sayable2 s2 = (a,b) ->{
            System.out.println("Hello " +a + " " + b);
        };
        s2.say("Manh","Toan");
    }
}
