import java.util.*;
class manuComp implements Comparator<Product>{
 public int compare(Product p1, Product p2){
   return p1.getMf().compareTo(p2.getMf());

 }
}