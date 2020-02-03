public class SavingsBank{

    double balance = 1000;

    public void deposit(double depositAmount){
        balance += depositAmount;
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount < balance)
            balance -= withdrawAmount;
        else
            System.out.println("\nPlease enter value less than your balance..");
    }

    public double checkBalance(){
        return this.balance;
    }
}