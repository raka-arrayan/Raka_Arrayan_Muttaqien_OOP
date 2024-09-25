public class IslamicAccount extends Account{
    private double  mudhorobahRate;

    public IslamicAccount(int accountNumber, double balance, Bank bank,AccountType accountType, double mudhorobahRate){
        super (accountNumber,balance,bank,accountType);
        this.mudhorobahRate=mudhorobahRate;
    }

    public double getMudhorobahRate() {
        return mudhorobahRate;
    }

//    public  addInterest(){
//
//    }

    public  void showDetail(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
