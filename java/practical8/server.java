import java.util.*; 
public class server implements Runnable { 
    ArrayList<Integer> queue; 
    final int size; 
    public server(ArrayList<Integer> queue,int size) { 
        this.size = size; 
        this.queue = queue; 
    } 

    public void run(){ 
        for(int i = 0; i < 6; i++){ 
            try { 
                Thread.sleep(100); 
            } 
            catch (InterruptedException ex) { 
                System.out.println("Interrupted"); 
            } 
            int j = i*i+95; 
            if(queue.size() == size){ 
                synchronized(queue){ 
                    System.out.println("Queue is full"); 
                    try{ 
                        queue.wait(); 
                    } 
                    catch(InterruptedException ex){ 
                        System.out.println("Interrupted"); 
                    } 
                } 
            } 
            synchronized(queue){ 
                System.out.println("Score: "+(j)); 
                queue.add(j); 
                queue.notifyAll(); 
            } 
        } 
    } 
}