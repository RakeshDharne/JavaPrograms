import java.util.Comparator;
import java.util.*;
//fractional knapsack

public class third {
 
    public static void main(String[] args) {
        

        int value[]={60,100,120};
        int weight[]={10,20,30};
        int maxwt=50;
        double ratio[][]=new double[value.length][2];

        //0th column =>idx 1st column =>ratio
        //
        for(int i=0;i<value.length;i++){

            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        //sorting the array on the basis of ratio so, that the index is same for their values and weight

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int val=0;
        int capacity=maxwt;

        //because the largest value ratio is on last index, and we want maximum profit;
        for (int j =ratio.length-1; j >=0; j--) {
            
            int indx=(int) ratio[j][0];
            if(capacity>=weight[indx])//iclude full item
            {
                val=val+value[indx];
                capacity=capacity-weight[indx];
            }else{
                //include fractional item;
                val=val+(int)ratio[j][1]*capacity;
                capacity=0;
                break;

            }
        }

        System.out.println(val);




                




    }
}
