import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
       
        int esum=0;
        int osum=0;

        do {
            
            System.out.print("enter no=");
            int no=sc.nextInt();

            if(no%2==0){
               esum+=no;
                     
            }else{
                osum+=no;
            
            }
            System.out.println("oddsum="+osum +"    " + "evensum ="+esum);
        } while (true);


    }
}
