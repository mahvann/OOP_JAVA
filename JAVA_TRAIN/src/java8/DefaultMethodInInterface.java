package java8;
interface Interface1{
    default void doSomething(){

    }

}
interface Interface2{
    default void doSomething(){
        System.out.println("Interface 2");
    }
}
public class DefaultMethodInInterface implements Interface1,Interface2{

    @Override
    public void doSomething() {
        Interface1.super.doSomething();
    }
}
