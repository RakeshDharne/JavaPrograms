public class programoptimised8 {

    public static boolean isprime(int no) {

        boolean flg=true;
        if(no==2){
            return true;
        }else{

            for (int i = 2; i <=Math.sqrt(no); i++) {
                if(no%i==0){
                    return false;
                }
                
            }
        }
        return flg;
        
    }

     
    public static void main(String[] args) {
         System.out.println(isprime(10));
    }
    
}
