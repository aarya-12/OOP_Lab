public class SavingsAccount extends BankAccount  implements Debitable{
     float amt;
     float ROI=4;
     //constructor
     SavingsAccount(){

     }
    public void openAccount(long accNo, long aadharNo, String name){
    super.openAccount(accNo,aadharNo,name);
   // this.amt=amt;
    }

    public void withdraw(float amt) {
    if(amt>balance){
         System.out.println("Insufficient Balance");
        }
    else {
            balance = balance - amt;
            System.out.println("Withdrawal of Rs."+amt+"successful");
            System.out.println("Your current balance is: "+balance);
        }
    }

    public void updateInterest() {
        balance = balance + (balance*(ROI/100));
        System.out.println("New balance with updated interest:"+balance);
    }
}