public interface PaymentGateway{
    public abstract void pay(String from, String to, double amount, String comments);

    public abstract void acceptPayments(String from, String to, double amount);
}