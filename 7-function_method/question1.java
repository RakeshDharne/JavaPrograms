import java.util.Scanner;

public class question1 {


    public static int  average(int a,int b,int c) {
         int avg=(a+b+c)/3;
         return avg;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter three number=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        System.out.println("average of three number is=="+average(a,b,c));
        
    }
}
