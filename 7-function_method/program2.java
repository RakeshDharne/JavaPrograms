import java.util.Scanner;

/**
 * program2
 */
public class program2 {

    public static int sumoftwo(int a,int b){//formal parameter ,parameters
        
        int sum =a+b;
        return sum;
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
    
     System.out.println("sum "+sumoftwo(a, b));//actual paramter,arguments
    }
}