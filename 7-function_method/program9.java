public class program9 {
     //optimised prime code and  printing prime no in range

    public static boolean isprime(int no) {
        if(no==2){
            return true;

        }else{
            for (int i =2; i <=Math.sqrt(no); i++) {
                if(no%i==0){
                    return false;
                }
                
            }
        }

        return true;
    
    }

    public static void inputrange(int no) {
        
        for (int i =2; i <=no; i++) {
            
            if(isprime(i)==true){
                System.out.print(" "+i);
            }
        }
        
    }

    public static void main(String[] args) {
       inputrange(100   );
          

    }
}
