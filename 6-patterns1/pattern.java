/**
 * pattern
 */
public class pattern {

    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){//for outer loop
            for(int j=1;j<=i;j++){//for inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}