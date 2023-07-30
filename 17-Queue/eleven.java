import java.util.Deque;
import java.util.LinkedList;

/**
 * Deque
 */
public class eleven {



    public static void main(String[] args) {
       Deque<Integer> deque=new LinkedList<>();
       deque.addFirst(10);
       deque.addFirst(20);
       deque.addFirst(30);
       deque.addLast(0);
       System.out.println(deque);


    }
}