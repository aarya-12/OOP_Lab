class Computer{
    float price;
    //define a monitor object here because monitor is a part of computer
    Monitor m;//reference of type monitor
    //constructor
    Computer(){

    }
    Computer(float p,Monitor m){
        this.price = p;
        this.m = m;
    }
    //getters and setters
    Monitor getM(){
        return m;
    }
    float getPrice(){
        return price;
    }

}