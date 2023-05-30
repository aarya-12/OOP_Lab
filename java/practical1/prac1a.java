
//Question
//Define a class to represent a Computer
//Define any attributes (data members of your choice)
//Amongst several attributes, computer also has a monitor, but it itself is an entity and can be defined as a separate class
//so, definne a separate class to represent a monitor.
class Monitor{
    int size;
    String companyName;
    //constructor
    Monitor(int s, String cN){
        this.size=s;
        this.companyName=cN;
    }
    Monitor(){

    }
    //getters and setters
    int getSize(){
        return size;
    }
    String getcompanyName(){
        return companyName;
    }

}

