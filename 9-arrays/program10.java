// maximum sum of subarray using prefix method
// 


public class program10 {
    public static int subArray(int array[]) {
        int ts=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int [array.length];
        int sum=0;

        //calculate pefix array
        prefix[0]=array[0];
        for (int i = 1; i < array.length; i++) {
            prefix[i]=prefix[i-1]+ array[i];
        }

        for (int i = 0; i < array.length; i++) {
            int start=i;
            for (int j = i; j < array.length; j++) {
                
                 int end=j;
                //  for (int k = start; k <= end; k++) {
                //     System.out.print(array[k]+" ");
                //      sum=sum+array[k];
                       
                //  }
                sum=start==0?prefix[end]:prefix[end]-prefix[start-1];

                 System.out.println("sum="+sum);
                 if(sum>max){
                    max=sum;
                 }
                 ts++;
                 System.out.println();
                
            }

            System.out.println();
        } 

        System.out.println("total sub array="+ts);
        return max;
    }

    public static void main(String[] args) {

        int array[]={1,2,3,4,5};
        System.out.println("maximum sum="+subArray(array));
    }
    
}
