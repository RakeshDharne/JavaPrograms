public class queation8 {
    public static void main(String[] args) {
        int n=14;
        for (int i = 1; i <=n/2; i++) {
            for (int j = 1; j <= (n/2-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1) ; j++) {
                System.out.print("*");
            
            }
            System.out.println();
            
                
        }
        
        
        for (int i = n/2; i >=1; i--) {
            
            for (int j = 1; j <= (n/2-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1) ; j++) {
                System.out.print("*");
            
            }
            System.out.println();
            
            
        }
    }
}
