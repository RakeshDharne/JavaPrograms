
import java.util.Comparator;
import java.util.*;

public class sixth {
    ///inndian coins

 public static void main(String[] args) {
    
    Integer arr[]={1,2,5,10,20,50,100,500,2000};
    int val=590;
    int count=0;
    
    Arrays.sort(arr,Comparator.reverseOrder());
    for(int i=0;i<arr.length;i++){
        if(arr[i]<=val){
            while(arr[i]<=val){

                count++;
                val=val-arr[i];
            }
        }
    } 
    System.out.println(count);
 }   

}
