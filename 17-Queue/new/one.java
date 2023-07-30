/**
 * one
 */
import java.util.*;
public class one {

    public static void main(String[] args) {
        ArrayList<Integer> AL=new ArrayList<>();
        AL.add(10);
        AL.add(20);
        AL.add(30);
        AL.add(40);
        AL.add(50);
       System.out.println(AL.size());
       AL.remove(2);
       System.out.println(AL);
       System.out.println(AL.get(2));
       AL.set(3, 60);
       System.out.println(AL);
       


    }
}