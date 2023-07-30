/**
 * first
 */
///basic operations
import java.util.*;
public class first {

    public static void main(String[] args) {
        
        HashMap<String,Integer> hm=new HashMap<>();
        //for inserting data

        hm.put("India",190);
        hm.put("Russia",295);
        hm.put("Gondia", 50);

        System.out.println(hm);

        //for getting data;
        System.out.println(hm.get("Gondia"));
        //if key is not available then return null
        System.out.println(hm.get("Bangladesh"));

        //remove
        hm.remove("Russia");
        System.out.println(hm);

        //check data 
        
        System.out.println(hm.containsKey("Russia"));
        System.out.println(hm.containsKey("Gondia"));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());


    
    }
}