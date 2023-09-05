package interface_;

public class VisaCard implements PaymentGateway {

    @Override
    public void payment() {
        System.out.println("payment by visa");
    }
}
