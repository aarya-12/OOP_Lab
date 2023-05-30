import java.util.ArrayList;
public class client implements Runnable {
    ArrayList<Integer> queue = new ArrayList<>(); 
    final int size; 
    static int i; 
    static int cnt; 
    public client(ArrayList<Integer> queue,int size) {
         this.size = size; 
         this.queue = queue; 
         i++; } 
         @Override public void run() { 
            for(int j=0; j < 6; j++){ 
                try { 
                    Thread.sleep(10); 
                }
                 catch (InterruptedException ex) { 
                    System.out.println("Interrupted");
                 } 
                 while(queue.isEmpty()){ 
                    synchronized(queue){ 
                        try{ 
                            queue.wait();
                         } 
                         catch(InterruptedException ex){
                             System.out.println("Interrupted"); 
                            } 
                        } 
                    } 
                    synchronized(queue){ 
                        queue.notifyAll(); 
                        cnt++;
                        int k = queue.get(0); 
                        System.out.println("Score Read by client "+cnt +": "+ k);
                     } //i++; 
                     if(cnt == i){ 
                        queue.remove(0);
                        cnt = 0; 
                        } 
                     System.out.println(); 
                } 

         }
        }