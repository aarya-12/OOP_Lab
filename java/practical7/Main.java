import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        String name,manuf;
        double discnt,cost;
        //Product p1 = new Product[50];
        Product p1;
        int i = 0;
        //File f1 = new File("/Users/aarya/Desktop/java/practical7/prac7.txt");
        BufferedReader b1 = new BufferedReader(new FileReader("/Users/aarya/Desktop/java/practical7/prac7.txt"));
        String st;
        ArrayList<Product> s1 = new ArrayList<Product>();
        while((st=b1.readLine())!=null){
            //System.out.println(st);
            String str[]=st.split(",");
            name=str[0];
            cost=Double.parseDouble(str[1]);
            manuf=str[2];
            discnt=Integer.parseInt(str[3]);
            p1=new Product();
            p1.setName(name);
            p1.setCost(cost);
            p1.setMf(manuf);
            p1.setDisc(discnt);
            s1.add(p1);
            i++;
            //System.out.println(p1[i]);
        }
        Scanner sc = new Scanner(System.in);
        while(true){
                
                System.out.println("Enter 1.Display the list of products using iterator\t\t");
                System.out.println("Enter 2.Display the list of products whose max_discount is 50%. Also display the final cost at which the product can be given.\t\t");
                System.out.println("Enter 3.Products sorted according to the cost");
                System.out.println("Enter 4.Products sorted according to the manufacturer");
                System.out.println("Enter 5.Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                    Iterator itr = s1.iterator();
                    System.out.print("List of products:\n");
                    while(itr.hasNext()){
                    Product p = (Product)itr.next();
                    System.out.println(p.toString());
                    }
                    break;

                    case 2:
                    ArrayList<Product> s2  = new ArrayList<>();
                    for(Product p:s1){
                    if(p.getDisc()<=50){
                    s2.add(p);
                     }
                    }
                    System.out.print("List of products whose max discount is 50%:\n");
                    for(Product p:s2){
                    System.out.println(p.toString());
                    }
                    System.out.print("Final cost:\n");
                    for(Product p:s2){
                    double d = p.getCost()-(p.getCost() * (p.getDisc()/100));
                    System.out.println(p.toString()+"\tFinal Cost: "+d);
                    }
                    break;

                    case 3:
                    System.out.print("Products sorted according to cost:\n");
                    Collections.sort(s1,new costComp());
                    for(Product p:s1){
                    System.out.println(p.toString());
                    }
                    break;

                    case 4:
                    System.out.print("Products sorted according to manufacturer:\n");
                    Collections.sort(s1,new manuComp());
                    for(Product p:s1){
                    System.out.println(p.toString());
                    }
                    break;

                    case 5:
                    System.out.print("..........Terminating........ ");
                    sc.close();
                    System.exit(0);
                    break;

                    default:
                    System.out.print("Enter a valid choice.");
                }
        }
        

    }


}