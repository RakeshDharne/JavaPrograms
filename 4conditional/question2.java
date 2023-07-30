import java.util.Scanner;

public class question2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  temp =sc.nextDouble();
        if(temp>100){
            System.out.println("you have a fever ");
        }

        else{
            System.out.println("you dont have a fever");
        }

    }
    
}
