

import java.time.LocalDateTime;

public class attendance {

    LocalDateTime timeIn;
    LocalDateTime timeOut;
    //constructors
    public attendance() {
    }
    
    public attendance(LocalDateTime timeIn, LocalDateTime timeOut) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }
    public LocalDateTime getTimeOut() {
        return this.timeOut;
    }

    //getters
    public LocalDateTime getTimeIn() {
        return this.timeIn;
    }

    public void setTimeIn(LocalDateTime timeIn) {
        this.timeIn = timeIn;
    }

   //setters
    public void setTimeOut(LocalDateTime timeOut) {
        this.timeOut = timeOut;
    }

    //Methods

    void setTimes(LocalDateTime timeIn, LocalDateTime timeOut){
		this.timeIn = timeIn;
		this.timeOut = timeOut;
	}

    
}
