
class FixedDepositAccount extends BankAccount{
    int lockInPeriod;
    int noOfYears; // no of years the account has been open
    //constructor
    public FixedDepositAccount(){

    }

    //methods
    public void openAccount(long accNo, long aadharNo, String name, int period){
        super.openAccount(accNo,aadharNo,name);
        this.lockInPeriod=period;
    }
    public void updateInterest(){
    if(noOfYears>=2 && noOfYears<2){
        this.ROI =6;
        this.balance = balance + (balance * (ROI/100));
        System.out.println("New balance with updated interest:"+balance);
    }
    if(noOfYears>=2 && noOfYears<5){
        this.ROI = 6.5f;
        this.balance = balance + (balance * (ROI/100));
        System.out.println("New balance with updated interest:"+balance);

    }
    if(noOfYears>5){
        this.ROI = 7;
        this.balance = balance + (balance * (ROI/100));
        System.out.println("New balance with updated interest:"+balance);


    }

}
   public void getNoOfYears(int year){
        noOfYears = year;
    }

    public void closeAccount(){
        if(noOfYears<lockInPeriod) {
            this.balance = balance - ((5 * balance) / 100);
}
        else if(noOfYears == lockInPeriod){
            this.balance = balance;
        }
        System.out.println("Balance in your fixed deposit account is: "+ balance);
        System.out.println("Account closed successfully.");
    }
}

