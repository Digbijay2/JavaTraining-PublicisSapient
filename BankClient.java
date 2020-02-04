public class BankClient{
    public static void main(String[] args) {

        Address address = new Address("202", "4thBlock, 18th cross, jayanagar", "Bangalore", 577142);
        BankAccount client[] = new BankAccount[10];
        for (int i = 0; i < 10; i++) {

          client[i] = new BankAccount(AccountType.SAVINGS_ACCOUNT, 2000 + i*2 , address);
          System.out.println(BankAccount.getAccountIdValue()); 
        }
       

    }
}