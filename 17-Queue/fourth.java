import java.util.LinkedList;
import java.util.*;
//using java collection frameworks;
public class fourth {


    public static void main(String[] args) {
    
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);
        q.remove();
        q.remove();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }


    }
}
