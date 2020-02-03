public class CalculatorClient{
    public static void main(String[] args) {
        //data-type variable-name = New Data-Type();

        Calculator calculator = new Calculator();
        System.out.println("Sum is:" + calculator.add(34,45));
        System.out.println("Difference is:" + calculator.subtract(877, 455));
        System.out.println("Product is:" + calculator.product(877,455));
        System.out.println("Divison is:" + calculator.division(877,455));
        System.out.println("Modulus is:"+ calculator.modulo(877,455));

    }
}