public class question6 {

    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <=n; i++) {
            //for i spaces 
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
                
            }
            System.out.println(" ");

        }
    }
    
}
