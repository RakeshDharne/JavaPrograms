import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int marks= sc.nextInt();
        String result=(marks>=40)?"pass":"fail";
        System.out.println(result);
    }
}
