import java.util.Comparator;
import java.util.*;

public class seventh {
    public static void main(String[] args) {
        
        int jobsInfo[][]={{1,10},{1,20},{2,30},{2,40},{4,70}};

        Arrays.sort(jobsInfo,Comparator.comparingDouble( o ->o[1]));

        int time=0;
        int maxprofit=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=jobsInfo.length-1;i>=0;i-- ){
            
            if( jobsInfo[i][0] > time){
                time++;
                //for indexces
                al.add(jobsInfo[i][1]);
                maxprofit+=jobsInfo[i][1];

            }
        }
        // for(int j=0;j<al.size();j++){
        //     System.out.println(al.get(j));
        // }
        System.out.println(maxprofit);

    }
}
