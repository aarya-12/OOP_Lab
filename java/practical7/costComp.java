import java.util.*;
class costComp implements Comparator<Product>{
 public int compare(Product p1 ,Product p2){
     if(p1.getCost()>p2.getCost()){
         return 1;
     }
     else if(p1.getCost()<p2.getCost()){
         return -1;
     }
     else{
         return 0;
     }

 }
}