public class question1 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if( i+j<n+1){
                    System.out.print(" ");
                }
                 else{
                    System.out.print( "*");
                }
            }
            System.out.println();
        }
    }
}

/*
 * public static void main(){
 * int n=4;
 * for(int i=1;i<=n;i++){
 *   for(int j=1;j<=n-i;j++){
 *   syso("  ");
 *  }
 *   for(int j=1;j<=i;j++ ){
 * 
 * syso("*");
 * }
 *sysoprintln;
 *   
 * 
 * 
 *   }
 * 
 *  }
 * 
 * 
 */