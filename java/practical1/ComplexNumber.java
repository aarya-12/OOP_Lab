class ComplexNumber{
    int real;
    int img;
    ComplexNumber(){

    }//constructors
    ComplexNumber(int real,int img){
        this.real = real;
        this.img = img; 
    }
    //get method naming conventions=get+datamember_name
    //both are returning integers so return type is int
    int getReal(){
        return real;
    }
    int getImg(){
        return img;
    }
    static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber c3 = new ComplexNumber(c1.getReal()+c2.getReal(),c1.getImg()+c2.getImg());
        return c3;
    }
    ComplexNumber add(ComplexNumber c2){
        ComplexNumber c3 = new ComplexNumber(this.getReal()+c2.getReal(),this.getImg()+c2.getImg());
        return c3;// would also work wihtout this as "this" is used in case of name ambiguity
    }
    static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber c3 = new ComplexNumber();
        c3.real =  (c1.real * c2.real) - (c1.img * c2.img);
        c3.img = (c1.real * c2.img) + (c1.img * c2.real); 
        return c3;
    }
}// can be defined as static as it is static thus can be called as classname.method
//otherwise call a methhod as objname.method