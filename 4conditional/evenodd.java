import java.util.Scanner;

/**
 * evenodd
 */
public class evenodd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        if(a%2==0){
            System.out.println("no. is even ");
        }
        else{
            System.out.println("no. is odd");
        }
    }
}