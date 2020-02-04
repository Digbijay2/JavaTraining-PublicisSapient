public class BankAccount{

    private double accountbalance = 10_000;
    private Address address;
    private AccountType accountType;
    private long accountId;
    private static long INITIAL_ACCOUNT_ID_VALUE = 10_000;

    public BankAccount(AccountType accountType, double initialDepositAmount, Address address){
        if(accountbalance > 10_000)
            this.accountbalance = initialDepositAmount;
        
        this.accountType = accountType;
        this.address = address;
        this.accountId = ++ INITIAL_ACCOUNT_ID_VALUE;
    }

    public BankAccount(AccountType accountType, Address address){
        this.accountType = accountType;
        this.address = address;
        this.accountId = ++ INITIAL_ACCOUNT_ID_VALUE;
    }

    public void deposit(double amount){
        this.accountbalance += amount;
    }

    public double withdraw(double amount){

        switch(this.accountType){
            case CURRENT_ACCOUNT: if((this.accountbalance - amount) > 25_000){
                this.accountbalance -= amount;
                return amount;
            }
            return 0;
        
            case SAVINGS_ACCOUNT: if((this.accountbalance - amount) > 10_000){
                this.accountbalance -= amount;
                return amount;
            }
            return 0;
            
            case SALARIED_ACCOUNT: if((this.accountbalance - amount) > 0){
                this.accountbalance -= amount;
                return amount;
            }
            return 0;
        
            default : return 0;
        }
    }

    public double checkAccountBalance(){
        return this.accountbalance;
    }

    public void updateAddress(Address address){
        this.address = address;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public long getAccountId(){
        return this.accountId;
    }

    public static long getAccountIdValue(){
        return INITIAL_ACCOUNT_ID_VALUE;
    }
}