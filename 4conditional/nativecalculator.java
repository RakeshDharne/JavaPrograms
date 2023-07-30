import java.util.Scanner;

public class nativecalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number ");
        int a=sc.nextInt();
        System.out.println("enter second number ");

        int b=sc.nextInt();
        System.out.println("which operation you want to perform");

        char opt=sc.next().charAt(0);
        switch(opt){
            case '+': System.out.println((a+b));
            break;
            case '-': System.out.println((a-b));
            break;
            case '/': System.out.println((a/b));
            break;
            case '*': System.out.println((a*b));
            break;
            default:System.out.println("invalid");
        }
    }
}
