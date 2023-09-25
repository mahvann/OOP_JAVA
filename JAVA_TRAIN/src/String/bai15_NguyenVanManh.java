package String;

import java.util.Scanner;

public class bai15_NguyenVanManh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = sc.nextLine();
        int []dd = new int[300];
        for (int i = 0;i<s.length();i++){
            dd[s.charAt(i)]++;
        }
        int max = -10000000;
        for (int i = 0;i<300;i++){
            if (dd[i]>max){
                max = dd[i];
            }
        }
        String rs = "";
        for (int i = 0;i<300;i++){
            if (max == dd[i] ){
                rs += (char)i + ",";
            }
        }
        System.out.println(rs.substring(0,rs.length()-1));
    }
}
