public class Account {

    private  int accountNumber;
    private double balance;
    private Bank bank;
    private AccountType accountType;

    public Account(int accountNumber, double balance, Bank bank, AccountType accountType){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.bank=bank;
        this.accountType=accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  void deposit (double amount){
        if (amount>0){
            balance+=amount;
        }
        else {
            System.out.println("error");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && balance >=0){
            balance-=amount;
        }
        else if (amount<=0) {
            System.out.println("error harus lebih dari 0");
        }
        else{
            System.out.println("error ");

        }
    }

    public void addInterest(){
        double interest = balance * (bank.getInterestRate());
        balance +=interest;
    }

    public void  showDetail(){
        System.out.println("Account number: " +  accountNumber);
        System.out.println("balance: " + balance);
        System.out.println("bank code: " +bank.getCode());
        System.out.println("Account Type: " +accountType);
        System.out.println();
    }
}
