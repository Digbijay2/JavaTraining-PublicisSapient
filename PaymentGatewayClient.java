public class PaymentGatewayClient{
    public static void main(String[] args) {
        PaymentGateway gateway = null;

        if(args[0].equals("1")){
            gateway = new GooglePay();
        } else{
            gateway = new Paytm();
        }

        gateway.pay(" kiran ", " Vinay ", 20000, " transferring money ");
        gateway.acceptPayments(" kiran ", " Vinay ", 20000);
    }
}