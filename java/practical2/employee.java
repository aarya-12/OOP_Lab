import java.time.LocalDateTime;

public class employee {

    int id, age, salary;
    String name, designation;
    static int workingDays = 0;
    // attendanceaArray of type Attendance (array to maintain day-wise attendance of an employee)
    attendance[][] attendanceArray = new attendance[12][10];//12 months and 10 days in each month
    attendance a = new attendance();
    String months[] = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October","November", "December" };
    //constructor
    employee(int id, int age, int salary, String name, String designation) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.designation = designation;
    }
    //getters
    public int getId() {
        return this.id;
    }
    public int getAge() {
        return this.age;
    }
    public int getSalary() {
        return this.salary;
    }
    public String getName() {
        return this.name;
    }
    public String getDesignation() {
        return this.designation;
    }
    public attendance[][] getAttendaceArray() {
        return this.attendanceArray;
    }
    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setAttendaceArray(attendance[][] attendanceArray) {
        this.attendanceArray = attendanceArray;
    }

    // Methods

    void createAttendance(int date, int month, int year, int inHour, int inMinutes, int outHour, int outMinutes) {

        LocalDateTime inDateTime = LocalDateTime.of(year, month, date, inHour, inMinutes);
        LocalDateTime outDateTime = LocalDateTime.of(year, month, date, outHour, outMinutes);

        attendance a = new attendance();

        a.setTimes(inDateTime, outDateTime);

        attendanceArray[month - 1][date - 1] = a;

        workingDays++;
    }

    void displayAttendance() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: Rs." + salary);

        for (int i = 0; i < attendanceArray.length; i++) {

            System.out.println("Month: " + months[i]);

            for (int j = 0; j < attendanceArray[i].length; j++) {

                if (attendanceArray[i][j] == null) {
                    continue;
                }

                System.out.println("Day:" + attendanceArray[i][j].timeIn.getDayOfWeek() + "\nTime in: "
                        + attendanceArray[i][j].timeIn + "\nTime out: " + attendanceArray[i][j].timeOut + "\n");

            }

        }
    }

    void displayWorkingDays() {
        System.out.println("\nNumber of days worked: " + workingDays + " Days");
    }

    void displayWorkingHours(int date, int month, int year) {
        try {
            if (attendanceArray[month - 1][date - 1].timeIn.getYear() == year) {
                System.out.println("Employee hours worked on " + date + "-" + month + '-' + year + " is " + (attendanceArray[month - 1][date - 1].timeOut.getHour()- attendanceArray[month - 1][date - 1].timeIn.getHour())+ " hours");
            } else {
                System.out.println("The attendance data for " + date + "-" + month + '-' + year + " doesn't exist.");
            }
                
        } catch (NullPointerException n) {
            System.out.println("The  data doesn't exist.");
        }
    }

}
