import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        if(input >0){
            System.out.println("positve number ");
        }
        else if(input ==0)
        {
            System.out.println("number is 0");
        }
        else{
            System.out.println("negaative");
        }
    }
    
}
