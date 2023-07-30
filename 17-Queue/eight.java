
//2    halves   interleave
import java.util.*;

public class eight {
    public static void twoHalvesinterleave(Queue<Integer> q) {

        int size = q.size();
        Queue<Integer> q2 = new LinkedList<>();
        int i = 0;
        while (i < size / 2) {
            q2.add(q.remove());
            i++;
        }
        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        twoHalvesinterleave(q);

    }
}
