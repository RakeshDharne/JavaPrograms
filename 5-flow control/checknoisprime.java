import java.util.Scanner;

/**
 * checknoisprime
 * 
 * 
 */
public class checknoisprime {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean isprime= true;
        while (true) {  //infinite loop
            System.out.print("enter no=");
            int no=sc.nextInt();
            if (no==2) {
                System.out.println("no is prime ");
            } else {
                for(int i=2;i<=Math.sqrt(no);i++){
                    if(no%i==0){
                        // System.out.println("no is not prime ");                 we cant use syso because it will print every time when it check condition
                        isprime=false;
                    }
                    
                }
                if (isprime==false) {
                    System.out.println("no is not prime ");
                } else {
                    System.out.println("no is prime");
                }
        
                
            }
            
        }
        
        
    }
}