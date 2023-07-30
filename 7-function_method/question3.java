import java.util.Scanner;

/**
 * question3
 */
public class question3 {

    public static boolean isEven(int no){
        if(no%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("enter number=");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(isEven(a));          
    }
}