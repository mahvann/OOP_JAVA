package IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        //How to initialize a directory in Java
        try{
            Path path = Paths.get("D:\\Java\\JavaBackend\\OOP_JAVA\\JAVA_TRAIN\\Data\\test");
            //initialize a directory with Files.createDirectory()
            Files.createDirectory(path);
            System.out.println("Directory is created!");
        }catch (NoSuchFileException e){
            System.out.println("Directory not exist");
        }
        catch (FileAlreadyExistsException e) {
            System.out.println("Folder is existed!");
        }
        catch (IOException e){
            System.out.println("Error IO");
        }

        //Initialize a directory with java IO

    }
}
