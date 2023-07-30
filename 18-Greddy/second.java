import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class second {
 
    public static void main(String[] args) {
        
        int start[]={1,3,0,5,8,5,10};
        int endt[]={4,6,7,2,9,9,20};
        
        int srtarr[][]=new int[start.length][3];
        for(int j=0;j<start.length;j++){

            srtarr[j][0]=j;
            srtarr[j][1]=start[j];
            srtarr[j][2]=endt[j];
        }

        // lambda function to sort 2-d array
        Arrays.sort(srtarr,Comparator.comparingDouble(o -> o[2]));
        // end time vasis sorted

        // 1st avtivity
        int maxAct=1;

        int end=srtarr[0][2];
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0);


        for (int i = 1; i < srtarr.length; i++) {
            //activity select
            if(srtarr[i][1]>=end){
                maxAct++;
                end=srtarr[i][2];
                al.add(srtarr[i][0]);
            }
            
        }
        System.out.println(maxAct );
        System.out.println( al);








       
        


        





    }
}
