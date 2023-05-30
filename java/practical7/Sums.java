public class Sums<T extends Number>{
    T[] nums;
    Sums(T[] o){
        nums = o;
    }
    double add_array(){
        double sum=0.0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum;
    }
    boolean sameSum(Sums<?> ob) {
        if(add_array() == ob.add_array())
            return true;
        return false;
    }
}
    
