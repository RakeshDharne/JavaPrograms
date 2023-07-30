//valid paranthesis

import java.util.*;


//valid paranthesis

public class seventh {


    public static boolean isvalidParathesis(String str)
    {
        Stack<Character> s= new Stack<>();

        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                s.push(ch);

            }
            else{
                if (s.isEmpty()) {
                    return false;
                }
                
                if((ch=='}'&&s.peek()=='{')||(ch==']'&&s.peek()=='[')||(ch==')'&&s.peek()=='(')){
                        s.pop();
                    }
                else{
                    return false;
                }    
                        
                
            }
        }
        if(s.isEmpty()){
            return true;
        }
        
        return false;

    }
                    




        

   

    public static void main(String[] args) {
         String str="([[]])";

         
         System.out.println(isvalidParathesis(str));


    }


}
