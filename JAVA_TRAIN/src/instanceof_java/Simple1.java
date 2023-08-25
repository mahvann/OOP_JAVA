package instanceof_java;

class Animal{

}
class Dog extends Animal{
    public static void main(String[] args) {
        Dog s = new Dog();
        System.out.println(s instanceof Dog); //wrapper class check
        System.out.println(s instanceof Animal);// An object with the type of the subclass also has the type of the superclass
        Dog dog = null;
        System.out.println(s instanceof Dog);


    }
}
