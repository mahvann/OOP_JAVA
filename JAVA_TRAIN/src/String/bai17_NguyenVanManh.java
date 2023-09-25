package String;

import java.util.Scanner;

public class bai17_NguyenVanManh {
    public static void chuanHoa(String s){
        String [] st =  s.trim().toLowerCase().split("\\s+");
        String rs = "";
        for (String ss: st){
            rs += ss.substring(0,1).toUpperCase() + ss.substring(1,ss.length())+" ";
        }
        System.out.println(rs.substring(0,rs.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = sc.nextLine();
        chuanHoa(s);
    }
}
