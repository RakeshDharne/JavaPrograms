public class program4 {

    public static int factorial(int no) {
        int fact=1;

        while(no>0){
            fact=fact*no;
            no--;
        }
        return fact;
        /*
         * for(i=1;i<n;i++ ){
         *   fact=fact*i; 
         * }
         * 
         */
        
    }
    public static void main(String[] args) {
        int a=7;
        int fact=factorial(a);
        System.out.println("factorial="+fact);
    }
}
