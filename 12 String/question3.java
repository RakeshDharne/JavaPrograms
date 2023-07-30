import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter first string");
         String str1=sc.next();
         System.out.println("enter second sring=");
         String str2=sc.next();
         
         str1=str1.toLowerCase();
         str2=str2.toLowerCase();
         if(str1.length()==str2.length()){
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();
             
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result= Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println("yes");

            }
            else{
                System.out.println("NOT");
            }







         }
         else{
            System.out.println("strings are not anagrams");
         }
         
    }
}
