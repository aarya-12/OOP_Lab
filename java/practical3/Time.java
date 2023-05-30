public class Time {

    int hours;
    int minutes;

    //constructors
    public Time() {
    }


    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    //setters and getters

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /*static void TimeAdd(Time t1, Time t2) {

        int extraMin;
        int extraHour = 0;
        int newHour, newMinute;

        if(t1.minutes + t2.minutes >= 60) {
            extraMin = (t1.minutes + t2.minutes) - 60;
            extraHour++;
            newMinute = extraMin;
            newHour = t1.hours + t2.hours + extraHour;
        }
        else {
            newHour = t1.hours + t2.hours;
            newMinute = t1.minutes + t2.minutes;
        }
        
        System.out.println("The added time is, " + newHour + ":" + newMinute);

    }*/
    //methods

    Time timeAdd(Time t2) {

        Time t3 = new Time();

        //Here since t1 is the calling function, all the stuff of t1 will directly go into its respective
        //variables that is, minutes and hours are representing that of t1. 
        //For t2, we are using t2.hours and t2.minutes
        t3.minutes = minutes + t2.minutes;
        t3.hours = hours + t2.hours; 

        if(t3.minutes >= 60) {
            t3.hours++;
            t3.minutes = t3.minutes - 60;
        }

        if(t3.hours >= 24) {
            System.out.println("Next day.");
            t3.hours = t3.hours - 24;
        }

        return t3;
    }

    /*static void TimeDifference(Time t1, Time t2) {

        int newHour = t1.hours - t2.hours;
        int newMinute;

        if(t2.minutes < t1.minutes) {
            newMinute = t1.minutes - t2.minutes; 
        }
        else {
            newMinute = 60 + t1.minutes - t2.minutes;
            newHour--;
        }

        System.out.println("The subtracted time is, " + newHour + ":" + newMinute);

    }*/

    Time timeSub(Time t2) {
        Time t3 = new Time();

        if(hours > t2.hours) {
            t3.hours = hours - t2.hours;
        }
        else {
            t3.hours = t2.hours - hours;
        }

        t3.minutes = minutes - t2.minutes;

        if(t3.minutes < 0) {
            t3.hours--;
            t3.minutes = 60 + t3.minutes;
        }

        return t3;
    }
    
}
