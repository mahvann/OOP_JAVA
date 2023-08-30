package instanceof_java;

class Animal{

}
class Dog extends Animal{
    static void method(Object obj){
        if(obj instanceof Dog){
            Dog dog = (Dog)obj;
            System.out.println("OK");
        }
        else System.out.println("Not OK");
    }
    public void eat(){
        System.out.println("eat bones");
    }
    public static void main(String[] args) {
        Dog s = new Dog();
        System.out.println(s instanceof Dog); //wrapper class check
        System.out.println(s instanceof Animal);// An object with the type of the subclass also has the type of the superclass
        Dog dog = null;
        System.out.println(dog instanceof Dog);

        Animal dog1 = new Dog();
        Dog.method(dog1);


        Dog dog2 = new Dog();
        Animal animal = dog2;
        if (animal instanceof Dog){
            ((Dog) animal).eat();
            System.out.println("Downcasting OK");
        }
        else System.out.println("Downcasting Not OK");


    }
}
