/**
 * first
 */
public class first {

    public static int factorial(int N) {
        
        if(N==0||N==1){
            return 1;
        }
          int fact= N * factorial(N-1);
          return fact;

    }
    public static void main(String[] args) {
       
        System.out.println( factorial(5));
        
    }
}