import java.util.Stack;
//java colllection framework
public class third {
    
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
         s.push(20);        s.push(30);

         while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

            


    }
}
