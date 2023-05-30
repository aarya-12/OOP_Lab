import java.util.Scanner;
public class Test 
{
    public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("The number of elements in the first array\n:");
        int n1 = sc.nextInt();
        Integer [] s = new Integer[n1];  
        System.out.println("Enter elements of the first array\n:");
        for(int i = 0; i < n1; i++)
        {
            s[i] = sc.nextInt();
        }
        Sums<Integer> s1 = new Sums<Integer>(s);
        double x = s1.add_array();
        System.out.println("Total sum of the first array is \n" + x);
        
        System.out.println("The number of elements in the second array\n:");
        int n2 = sc.nextInt();
        Integer [] k = new Integer[n2]; 
        System.out.println("Enter elements of the second array\n:");
        for(int i = 0; i < n2; i++)
        {
           k[i] = sc.nextInt();
        }
        Sums<Integer> s2 = new Sums<Integer>(k);
        double y = s2.add_array();
        System.out.println("Total sum of the second array is \n" + y);
        
        System.out.println("Comparing the sum of two arrays\n");
        
        if(s1.sameSum(s2))
            System.out.println("Sum is same.");
        else
            System.out.println("Sums differ.");
    }
}


