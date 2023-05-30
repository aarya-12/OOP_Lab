public class BankAccount{
    long accNo;
    long aadharNo;
    String name;
    float ROI;
    float balance;
    //constructor
    BankAccount(){

    }
    //methods
    public void openAccount(long accNo, long aadharNo, String name){
        this.accNo = accNo;
        this.aadharNo = aadharNo;
        this.name = name;
        this.ROI =4;
        //this.balance = balance;
        System.out.println("Account successfully created with account number: "+accNo);

    }

    public void deposit(float amount){
        this.balance = balance + amount;
        System.out.println("Amount added:"+amount);
        System.out.println("New balance:"+balance);
    }

    public void closeAccount(long accNo){
        System.out.println("Current balance in your account with account number " +accNo+ " is: "+balance);
        this.balance = 0;
        System.out.println("This account is closed "+accNo);
    }

    public void updateInterest(){
        //this.ROI = 0.04; ?
        this.balance = balance + (balance * (ROI/100) * 1);
        System.out.println("New balance with updated interest:"+balance);

    }


}
