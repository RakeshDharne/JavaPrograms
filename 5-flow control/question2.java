import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int no=sc.nextInt();
        int fact=1;
        while (no>0) {

            fact=fact*no;
            no-=1;
        }
        System.out.println(fact);
            
    }
    
}
