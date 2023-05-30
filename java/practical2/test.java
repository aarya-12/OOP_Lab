

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        employee e1 = new employee(01, 20, 90000, "abc", "xyz");

        Scanner sc = new Scanner(System.in);

        e1.createAttendance(6, 3, 2022, 8, 3, 15, 9);
        e1.createAttendance(4, 4, 2022, 10, 8, 15, 35);
        e1.createAttendance(2, 5, 2022, 10, 3, 14, 9);
        e1.createAttendance(9, 6, 2022, 10, 7, 13, 25);
        e1.createAttendance(8, 8, 2022, 10, 3, 18, 9);
        e1.createAttendance(5, 8, 2022, 9, 15, 16, 30);
        e1.createAttendance(4, 1, 2022, 10, 4, 18, 20);
        e1.createAttendance(3, 5, 2022, 11, 3, 20, 9);
        e1.createAttendance(10, 12, 2022, 11, 5, 15, 45);
        e1.createAttendance(1, 12, 2022, 7, 3, 16, 30);

        while (true) {

            System.out.println();
            System.out.println("1 displays Attendance. ");
            System.out.println("2 displays Working Days. ");
            System.out.println("3 displays Working Hours. ");
            System.out.println("4 Exit. ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println();
                    e1.displayAttendance();
                    break;

                case 2:
                    System.out.println();
                    e1.displayWorkingDays();
                    break;

                case 3:
                    System.out.println();
                    e1.displayWorkingHours(10, 12, 2022);
                    e1.displayWorkingHours(10, 3, 2022);
                    e1.displayWorkingHours(3, 8, 2022);
                    break;

                case 4:
                    sc.close();
                    System.exit(0);
                    break;

                default:
            }
        }
    
    
        
    
        
    
        
    
    }
}
