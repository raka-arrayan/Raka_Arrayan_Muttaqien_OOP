public class ConventionalAccount extends  Account {
    private  double credit;
    private double creditInterestRate;

    public ConventionalAccount(int accountNumber, double balance, Bank bank,AccountType accountType, double creditInterestRate){
        super (accountNumber,balance,bank,accountType);
        this.creditInterestRate=creditInterestRate;
        this.credit=0;
    }

    public double getCredit() {
        return credit;
    }
    pub

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public  void  payCredit(){
//        if (getBalance()>credit) {
//            setBalance(getBalance()) = -credit;
//        }
    }

    public  void addCredit(double amount){
        //100 (credit = credit + (amount*creditInterestRate/100);
    }

    public void addCredit(double amount, double discountRate){

    }

//    public showDetail(){
//        System.out.println("Credit : " + credit);
//        System.out.println("Credit Rate:" + creditInterestRate);
//    }
}
