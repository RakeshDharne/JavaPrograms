import java.util.Stack;

/**
 * fifth
 */

///reverse string using stack


public class fifth {

    public static void revString(String str){

        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<str.length()) {
            s.push(str.charAt(i));
            i++;
          }

          String str2="";
          while (!s.isEmpty()) {
            str2+=s.peek();
            s.pop();
            
          }
          System.out.println(str2); 


    }

    public static void main(String[] args) {
        String str="Rakesh";
        revString(str);




    }
}







//  Stack<Character> s=new Stack<>();
//         int i=0;
//         while (i<str.length()) {
//             s.push(str.charAt(i));
//             i++;
//           }

//         }
//         String str2="";

//         while(!s.isEmpty()){
//            str2+=s.peek();
//             s.pop();

//         }