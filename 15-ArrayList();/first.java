/**
 * first
 */
import java.util.*;
public class first {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(41);
        list.add(50);

        list.add(3, 40);
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
       System.out.println();
       list.remove(4);
       System.out.println(list);
       list.set(0, 5);
       System.out.println(list);
       System.out.println(list.contains(0));
       System.out.println(list.size());

    }

}