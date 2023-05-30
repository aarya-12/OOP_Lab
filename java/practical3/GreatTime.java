

public class GreatTime extends Time{

    int secs;
    int ms;
    //constructors
    public GreatTime() {
    }

    public GreatTime(int hours, int minutes, int secs, int ms) {
        super(hours, minutes);
        this.secs = secs;
        this.ms = ms;
    }
    //getters and setters
    public int getSecs() {
        return this.secs;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }

    public int getMs() {
        return this.ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }
    //methods
    GreatTime timeAdd(GreatTime t2) {
        GreatTime t3 = new GreatTime();

        t3.ms = ms + t2.ms;
        t3.secs = secs + t2.secs;
        t3.minutes = minutes + t2.minutes;
        t3.hours = hours + t2.hours;
        
        if(t3.ms >= 1000) {
            t3.secs++;
            t3.ms = t3.ms - 1000;
        }

        if(t3.secs >= 60) {
            t3.minutes++;
            t3.secs = t3.secs - 60;
        }

        if(t3.minutes >= 60) {
            t3.hours++;
            t3.minutes = t3.minutes - 60;
        }

        if(t3.hours >= 24) {
            System.out.println("Its the NEXT DAY!");
            t3.hours = t3.hours - 24;
        }

        return t3;
    }

    GreatTime timeSub(GreatTime t2) {
        GreatTime t3 = new GreatTime();

        int time1, time2;
        int temp;

        time1 = ms + (secs*1000) + (minutes*60*1000) + (hours*60*60*1000);
        time2 = ms + (secs*1000) + (minutes*60*1000) + (hours*60*60*1000);

        if(time1 > time2) {
            temp = time1 - time2;
        }
        else {
            temp = time2 - time1;
        }

        t3.ms = temp % 1000;
        temp = temp/1000;

        t3.secs = temp % 60;
        temp = temp/60;

        t3.minutes = temp % 60;
        temp = temp/60;

        t3.hours = temp;
        
        return t3;   
    }

    
}
