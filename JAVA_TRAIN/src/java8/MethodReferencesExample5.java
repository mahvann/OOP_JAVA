package java8;

import java.util.Arrays;
import java.util.List;

class Bicycle1 {
    private String brand;
    private Integer frameSize;

    public Bicycle1(String brand) {
        this.brand = brand;
        this.frameSize = 0;
    }


    // Getter và Setter cho brand và frameSize (nếu cần)

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

public class MethodReferencesExample5 {
    public static void main(String[] args) {
        List<String> bikeBrands = Arrays.asList("Giant", "Scoot", "Trek", "GT");

        //Reference to a constructor – Class::new

        // Sử dụng .toArray để lưu trữ kết quả vào một mảng Bicycle1[]
        //Bicycle1[] bicycles = bikeBrands.stream().map(Bicycle1::new).toList().toArray(new Bicycle1[0]);
        Bicycle1[] bicycles = bikeBrands.stream().map(Bicycle1::new).toArray(Bicycle1[] ::new);

        // In danh sách các đối tượng Bicycle1
        for (Bicycle1 bicycle : bicycles) {
            System.out.println("Brand: " + bicycle.getBrand() + ", Frame Size: " + bicycle.getFrameSize());
        }
    }
}
