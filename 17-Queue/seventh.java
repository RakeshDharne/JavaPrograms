//first non repeating letters
import java.util.*;

public class seventh {

    
    
    public static void main(String[] args) {
        
        int frq[]=new int [26];
        Queue <Character> q= new LinkedList<>();
        String str="aabccxb";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            q.add(ch);
            frq[ch-'a']++;
            while (!q.isEmpty()&&frq[q.peek()-'a']>1) {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1+" ");

            }
            else{
                System.out.println(q.peek()+" ");
            }
        }
        System.out.println();

            
            
        
    }
}
