package Exeption;
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message){
        super(message);
    }
}
public class CustomExeption {
    public void myMethod(int age) throws CustomCheckedException{
        if(age > 20){
            throw new CustomCheckedException("Age is greater than 20");
        }else{
            System.out.println("OK");
        }
    }
    public static void main(String[] args) throws Exception {
        int age = 20;

        try {
            new CustomExeption().myMethod(21);
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}
