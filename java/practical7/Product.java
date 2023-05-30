
public class Product
    {
    private String product_name,manufacturer;
    private double max_discount, cost;

    void setName(String name){
        product_name=name;
    }
    void setMf(String mfc){
        manufacturer=mfc;
    }
    void setCost(double cst){
        cost=cst;
    }
    void setDisc(double disct){
        max_discount=disct;
    }
    String getName(){
        return product_name;
    }
    String getMf(){
        return manufacturer;
    }
    double getCost(){
        return cost;
    }
    double getDisc(){
        return max_discount;
    }
    public String toString(){
        return ("Product Name: "+product_name+" Cost: "+cost+" Manufacturer: "+manufacturer+" Maximum Discount: "+max_discount);
    }

}

