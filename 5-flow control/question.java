import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number=");
        int no = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no + "*" + i + " =" +( i * no));
        }
    }
}
