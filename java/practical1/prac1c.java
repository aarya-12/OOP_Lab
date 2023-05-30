// Main method
class Test{
    public static void main(String ar[]){
        //create a monitor object
        Monitor m1 = new Monitor(13, "Dell");
        //create a computer object; attach monitor to computer
        Computer c = new Computer(24.89f,m1);
        //print the size of computer's monitor
        System.out.println("Size ="+c.getM().getSize());
        // print the company name of computer's monitor
        System.out.println("Company Name= "+c.getM().getcompanyName());

    }
}