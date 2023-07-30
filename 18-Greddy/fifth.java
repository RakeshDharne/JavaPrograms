import java.util.Comparator;
import java.util.*;

public class fifth {
 
    public static void main(String[] args) {
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));

        int chaincount=1;
        int endOffirstchain=pair[0][1];

        for(int i=1;i<pair.length;i++){
            
            if(pair[i][0]>=endOffirstchain){
                chaincount++;
                endOffirstchain=pair[i][1];
            }
        }

        System.out.println(chaincount);








    }
}
