package interface_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentGateway paymentGateway = null;
        System.out.println("Enter option: ");
        String op = sc.nextLine();
        if (op.equals("visa")){
            paymentGateway  = new VisaCard();
        }
        else if (op.equals("master")){
            paymentGateway = new MasterCard();
        }
        paymentGateway.payment();
        VisaCard visa = new VisaCard();
        visa.payment();
    }
}
