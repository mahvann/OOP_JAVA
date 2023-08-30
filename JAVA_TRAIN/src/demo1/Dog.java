package demo1;

public class Dog {
    public String name;
    Dog(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
