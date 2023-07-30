/**
 * fifth
 */
//using java collection frameworks bit ArrayDeque<>();
import java.util.*;
public class fifth {

    public static void main(String[] args) {
        
        Queue<Integer> q= new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }

    }
}