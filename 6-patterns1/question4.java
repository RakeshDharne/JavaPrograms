 

/**
 * question4
 */
public class question4 {

    public static void main(String[] args) {
        int n=5;
       
        
        for(int i=1;i<=n;i++){
            if(i%2==1){

            
            for(int j=1;j<=i;j++){
                 
                if(j%2==1){
                    System.out.print(1);
                    
                }
                else{
                    System.out.print(0);
                    
                }
            }
        }
            else{
                for(int j=1;j<=i;j++){
                 
                    if(j%2==1){
                        System.out.print(0);
                        
                    }
                    else{
                        System.out.print(1);
                        
                    }

                }
            
        }
        System.out.println();
    }
}
}







// public static void zero_one_triangle(int n) {

//     for (int i = 0; i <=n; i++) {
//         for(int j=1;j<=1;j++){
//             if((i+j)%2==0){
//                 System.out.println("1");

//             }
//             else{
//                 System.out.println("0");
//             }
//            syso("\n");
//         }
        
//     }
    
// }





 











