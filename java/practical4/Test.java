import java.util.Scanner;
public class Test {
        public static void main(String[] args) {
            String str;
            long acc,aadharno;
            int input;
            float bal;
            int year1,year2;
            Scanner sc = new Scanner(System.in);
            while(true){
                
                System.out.println("Enter 1.Savings Account\t\t");
                System.out.println("Enter 2.Fixed-Deposit Account\t\t");
                System.out.println("Enter 3.Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                     SavingsAccount obj1 = new SavingsAccount();
                     System.out.println();
                     System.out.print("Enter your name: ");
                     str = sc.nextLine();
                     sc.nextLine();
                     System.out.print("Enter your account number:");
                      acc = sc.nextLong();
                      System.out.print("Enter your Aadhar number:");
                      aadharno = sc.nextLong();
                     obj1.openAccount(acc,aadharno,str);
                      System.out.println();
                      System.out.print("Enter the amount to be deposited: ");
                      bal = sc.nextFloat();
                      obj1.deposit(bal);
                      System.out.println();
                      obj1.updateInterest();
                      System.out.println();
                      System.out.print("Enter amount to be withdrawn: ");
                      obj1.withdraw(sc.nextInt());
                      System.out.println();
                      obj1.closeAccount(acc);
                    break;

                    case 2:
                    FixedDepositAccount obj2 = new FixedDepositAccount();
    System.out.println();
    sc.nextLine();
    System.out.print("Enter your name: ");
    str = sc.nextLine();
    System.out.print("Enter your account number:");
    acc = sc.nextLong();
    System.out.print("Enter your Aadhar number:");
    aadharno = sc.nextLong();
    System.out.print("Enter your lock in period:");
    year1 = sc.nextInt();
    obj2.openAccount(acc,aadharno,str,year1);
    System.out.println();
    System.out.print("Enter the amount to be deposited: ");
    bal = sc.nextFloat();
    obj2.deposit(bal);
    System.out.println();
    obj2.updateInterest();
    System.out.println();
    System.out.print("Enter your closing year:");
    year2 = sc.nextInt();
    obj2.getNoOfYears(year2);
    obj2.closeAccount();
                    break;

                    case 3:
                    System.out.print("..........Terminating........ ");
                    sc.close();
                    System.exit(0);
                    break;

                    default:
                    System.out.print("Enter a valid choice.");
                }
            }
        }
}
                       


