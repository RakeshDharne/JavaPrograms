public class program5 {
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

    public static int bincoeff(int n,int r) {

        int nfact=factorial(n);
        int rfact=factorial(r);
        int n_rfact=factorial((n-r));
        int binc=nfact/(rfact*n_rfact);
        return binc;
        
    }

    public static void main(String[] args) {
     int n=10;
     int r=5;
     

   
     System.out.println("binomail coefficient ="+bincoeff(n, r));
     System.out.println("binomail coefficient ="+bincoeff(5, 2));
        

    }
}
  