public class question9 {
    public static void main(String[] args) {
        int n=9 ;

        for (int i = 1; i <=n; i++) {
            //for space
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
             // for numbers

            for (int j =1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
            
                
        }
    } 
}
                
                
            
