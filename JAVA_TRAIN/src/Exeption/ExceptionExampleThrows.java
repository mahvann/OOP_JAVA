package Exeption;

import java.io.IOException;

public class ExceptionExampleThrows {
    public void aMethod() throws IOException{
        throw new IOException("Device error");
    }

    public static void main(String[] args) throws Exception{
        try{
            ExceptionExampleThrows exceptionExampleThrows = new ExceptionExampleThrows();
            exceptionExampleThrows.aMethod();
        }catch (IOException e){
            System.out.println("Exception handle!!");
            //throw new Exception("New Exception",e);
        }
        finally {
            System.out.println("finally blocks!");
        }

        System.out.println("Hello guy!!");
    }
}
