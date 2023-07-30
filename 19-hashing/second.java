
//Iteration on HashMap:

import java.util.HashMap;
import java.util.*;

public class second {
   public static void main(String[] args) {

    HashMap<String,Integer> hm= new HashMap<>();
    hm.put("India",150);
    hm.put("Russia", 234);
    hm.put("china", 97);
    hm.put("gondia",99);

    Set<String> keys=hm.keySet();
    //entrySet()
    System.out.println(keys);///with bracket

    for (String k : keys) {
        
        System.out.println(k+" "+"population="+hm.get(k));//without bracket

    }

   } 
}
