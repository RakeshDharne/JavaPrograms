public class fifth {


    public static void isPalindrome(String str) {
        for (int i = 0; i <str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("strings are not palindrome");
                break;
            }
            
        }
        System.out.println("string is palindrome");
        
    }
    public static void main(String[] args) {
        //check if string is palindrome or not
        String str="racecar";

        isPalindrome(str);

    }
    
}
