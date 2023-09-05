package instanceof_java;


class Animal{

}
class Dog extends Animal{
    public void eat(){
        System.out.println("eat bone");
    }
    public static void main(String[] args) {
        Animal a = new Dog(); //upcasting
        if (a instanceof Dog){
            Dog dog = (Dog) a;
            System.out.println("a thuoc object Dog");
            dog.eat();
        }
        else{
            System.out.println("a ko thuoc object Dog");
        }

        System.out.println("--------------------------");

      //  Dog b = (Dog)new Animal(); //Khi trỏ từ kiểu con sang kiểu cha thì kiểu cha này có thể ko có những phương thức, thuôc tính mà kiểu con đang có nên bị lỗi


        Dog a1 =new Dog();
        Animal b1 = a1; //upcasting

        if (b1 instanceof Dog){
            Dog a2 = (Dog)b1;
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
