

public class Test {

    public static void main(String[] args) {
        Time t1 = new Time(11,50);
        Time t2 = new Time(15, 25);

        Time t3 = t1.timeAdd(t2);

        System.out.println("Time, "  + t3.hours + " Hours: " + t3.minutes  + " Minutes");
        System.out.println("");

        t3 = t1.timeSub(t2);

        System.out.println("Time, "  + t3.hours + " Hours: " + t3.minutes  + " Minutes");
        System.out.println("");

        GreatTime gt1 = new GreatTime(5,10,5,10);
		GreatTime gt2 = new GreatTime(10,5,10,5);

        GreatTime gt3 = gt1.timeAdd(gt2);

        System.out.println("Time, "  + gt3.hours + " Hours: " + gt3.minutes  + " Minutes: "+ gt3.secs  + " Secs: "+ gt3.ms  + " MiliSecs");
        System.out.println("");

        gt3 = gt1.timeSub(gt2);
        System.out.println("Time, "  + gt3.hours + " Hours: " + gt3.minutes  + " Minutes: "+ gt3.secs  + " Secs: "+ gt3.ms  + " MiliSecs");
        System.out.println("");


    
}

}
