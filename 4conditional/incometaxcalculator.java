import java.util.Scanner;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inm=sc.nextInt();
        double tax=0;
        if(inm<=500000){
            tax=0;
        }
        else if(inm>50000&&inm<1000000){
            tax= (inm*0.2);
        }
        else{
            tax=  (inm*0.3);
        }
        System.out.println(tax);

    }
}
