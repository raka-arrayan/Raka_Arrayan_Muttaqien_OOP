public  class Main {

    public static void main(String[] args) {

        Bank bank = new Bank(1,"BMRI",2.5);
//        Bank bank = new bank (1,"BMRI",2.5);

        Account account = new Account(1,80000.0,bank,AccountType.Conventional);

        account.showDetail();



//        Bank BJB = new Bank(1,"BJBR",5);
//        Bank JAGO = new Bank(2,"ARTO",5.5);
//        Bank BSI = new Bank(3,"BRIS",7);
//
//        Account akunBJB = new Account(1,20000,BJB,AccountType.Conventional);
//
//        akunBJB.showDetail();



    }
}