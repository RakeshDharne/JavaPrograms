import java.util.HashMap;
import java.util.Set;

/**
 * third
 */
public class third {

    //

    public static void main(String[] args) {
      
        int arr[]={1,3,2,5,1,3,1,5,1};
       
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Integer> keyset= map.keySet();
        for (Integer I : keyset) {
            if(map.get(I)>arr.length/3){
                System.out.println(map.get(I));
            }
            
        }

    }
}