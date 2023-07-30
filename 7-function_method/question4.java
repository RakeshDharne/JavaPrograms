public class question4 {

    public static boolean isPalindrome(int no) {
        int realno=no;
        int rev=0;
        while (no>0) {
            int dig=no%10;
            rev=rev*10+dig;
            no/=10;
        }
        if(rev==realno){
            return true;
        }
        else{
            return false;
        }
            

        
    }
    public static void main(String[] args) {
       System.out.println( isPalindrome(111));
    }
    
}
