import java.util.Scanner;

public class BankClient{
    public static void main(String[] args) {
        SavingsBank client1 = new SavingsBank();
        Scanner sc = new Scanner(System.in);

        int option=0;
        while(option!=4){

            System.out.println("\nChoose any:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Exit\n");
    
            option = sc.nextInt();

        switch(option)
        {
            case 1: double Balance = client1.checkBalance();
                    System.out.println(" "+Balance); 
                    break;
            case 2: System.out.println("\nEnter the amount to deposit:");
                    double amount1 = sc.nextDouble();
                    client1.deposit(amount1);
                    break;
            case 3: System.out.println("\nEnter the amount to withdraw:");
                    double amount2 = sc.nextDouble();
                    client1.withdraw(amount2);
                    break;
            case 4: System.exit(0);
            default: System.out.println("\nPlease select between the above options..");
                     break;
        }
    }
      
    }
}