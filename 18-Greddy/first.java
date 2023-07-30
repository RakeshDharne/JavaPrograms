/**
 * first
 */
//Activity Selection *Greddy Algorithm 
public class first {


    public static void main(String[] args) {
    
        int start[]={1,3,0,5,8,5,10};
        int endt[]={2,4,6,7,9,9,20};
        //

        int count=1;
        //firstly sort on the basis of end time.
        int begin =endt[0];
        //first as default 
        for (int i = 1; i < endt.length; i++) {
            
            if(begin<=start[i]){
                count++;
                begin=start[i];
            }

        }
        System.out.println(count);




    }

    
}