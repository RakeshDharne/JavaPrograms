public class question10 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <=n; i++) {

            //space
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
                
            }

            // //for numbers
            // for (int j = i; j >=1; j--) {//descending loop
            //     if(j==1){
            //         for (int j2 = 1; j2 <=i; j2++) {//ascending loop
            //             System.out.print(j2);
                        
            //         }
            //     }else{
            //         System.out.print(j);
            //     }
                
            // }


            //descending
            
            for (int j = i; j >=1; j--) {
                System.out.println(j);
                
            }
            //ascending

            for (int j = 2; j <=i; j++) {
                System.out.println(j);
            }
                
            System.out.println();

        }
    }
}
