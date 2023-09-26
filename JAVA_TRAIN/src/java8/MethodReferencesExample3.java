package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Bicycle{
    private String brand;
    private Integer frameSize;

    public Bicycle() {
    }

    public Bicycle(String brand, Integer frameSize) {
        this.brand = brand;
        this.frameSize = frameSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(Integer frameSize) {
        this.frameSize = frameSize;
    }
}
class BicycleComparator implements Comparator<Bicycle>{
    @Override
    public int compare(Bicycle a, Bicycle b){
        return a.getFrameSize().compareTo(b.getFrameSize());
    }

}
public class MethodReferencesExample3 {
    public static void main(String[] args) {
        //Refers to an instance method of a particular object – object::instanceMethod
        BicycleComparator bicycleComparator = new BicycleComparator();

        List<Bicycle> createBicycleList = new ArrayList<>();
        Bicycle b1 = new Bicycle("fixed gear1",10);
        Bicycle b2 = new Bicycle("fixed gear2",9);
        Bicycle b3 = new Bicycle("fixed gear3",7);
        Bicycle b4 = new Bicycle("fixed gear4",12);
        Bicycle b5 = new Bicycle("fixed gear5",10);

        createBicycleList.add(b1);
        createBicycleList.add(b2);
        createBicycleList.add(b3);
        createBicycleList.add(b4);
        createBicycleList.add(b5);

        //Lambda
        createBicycleList.stream().sorted((a,b)->bicycleComparator.compare(a,b));



        // create stream to sort, then transform to list
        //Refers to an instance method of a particular object – object::instanceMethod
        createBicycleList.stream().sorted(bicycleComparator::compare).toList().forEach(bicycle-> {
            System.out.println(bicycle.getBrand() + " " + bicycle.getFrameSize());
        });

        System.out.println();
        createBicycleList.forEach(bicycle -> {
            System.out.println(bicycle.getBrand() + " " + bicycle.getFrameSize());
        });

    }
}
