import java.util.Scanner;

/**
 * switchstm
 */
public class switchstm {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("select option ");
        int no=sc.nextInt();
        switch(no){
            case 1: System.out.println("mango");
            break;
            case 2: System.out.println("icecream ");
            break;
            case 3:System.out.println("banana");
            break;
            default:System.out.println("invalid"); 
        }
    }
}
