class TestDrive{
    //one file one class
    public static void main(String ar[]){
        ComplexNumber c1=new ComplexNumber(1,2);
        ComplexNumber c2=new ComplexNumber(2,3);
        System.out.println("-----First number-----");
        System.out.println(c1.getReal() +"+i"+c1.getImg());
        System.out.println("-----Second number-----");
        System.out.println(c2.getReal() +"+i"+c2.getImg());
        System.out.println("-----Addition-----");
        ComplexNumber result = ComplexNumber.add(c1,c2);
        System.out.println(result.getReal()+"+i"+result.getImg());
        ComplexNumber result1 = c1.add(c2);
        System.out.println(result1.getReal()+"+i"+result1.getImg());
        System.out.println("-----Multiplication-----");
        ComplexNumber result2 = ComplexNumber.multiply(c1,c2);
        System.out.println(result2.getReal()+result2.getImg()+"+i");
    }
   
}