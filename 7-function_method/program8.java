public class program8 {


   /*  public static boolean isprime(int no) {
        boolean flg=true;
        if(no==2){
            flg=true;
            return flg;
        }else{
            for(int i=2;i<=no-1;i++){
                if(no%i==0){
                    flg=false;
                    break;
                    
                }else
                {
                    flg=true;
                
                }
            }
            return flg;
        }
        
    }*/

    public static boolean isprime(int n) {
        boolean isprime=true;
        if (n==2) {
            return true;
            
        } else {
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    //isprime=false;
                    return false;
                    //break;
                }
            }
            
        }

        return isprime;  
        
    }
    public static void main(String[] args) {
        
        System.out.println(isprime(11));
    }
}
