/**
 * third
 */
import java.util.*;
public class third {


    public static void main(String[] args) {
     
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);        
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(50);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}