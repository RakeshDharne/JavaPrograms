import java.util.Scanner;

public class continuestsement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            int number=sc.nextInt();
            if(number%10==0){
                continue;
            }
            System.out.println(number);
            
        } while (true); 
    }
}
