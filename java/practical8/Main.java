import java.util.ArrayList; 
public class Main { 
    public static void main(String[] args) throws InterruptedException { 
        ArrayList<Integer> queue = new ArrayList<>(); 
        int size = 5; 
        Thread pthread = new Thread(new server(queue,size),"Server"); 
        Thread c1thread = new Thread(new client(queue,size),"Client1"); 
        Thread c2thread = new Thread(new client(queue,size),"Client2"); 
        Thread c3thread = new Thread(new client(queue,size),"Client3"); 
        Thread c4thread = new Thread(new client(queue,size),"Client4"); 
        pthread.start(); Thread.currentThread().sleep(10); 
        c1thread.start(); Thread.currentThread().sleep(10); 
        c2thread.start(); Thread.currentThread().sleep(10); 
        c3thread.start(); Thread.currentThread().sleep(10); 
        c4thread.start(); 
    } 
}