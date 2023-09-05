package interface_;

public class MasterCard implements PaymentGateway,Done{
    @Override
    public void payment() {
        System.out.println("payment by master");
    }

    @Override
    public void done() {
        System.out.println("completed");
    }
}
