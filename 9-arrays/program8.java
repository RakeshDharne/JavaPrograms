
//sub array
//maximum sum of sub array

public class program8 {
    
    public static int subArray(int array[]) {
        int ts=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start=i;
            for (int j = i; j < array.length; j++) {
                 int sum=0;
                 int end=j;
                 for (int k = start; k <= end; k++) {
                    System.out.print(array[k]+" ");
                     sum=sum+array[k];
                       
                 }
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
        int array[]={3,4,5,6,7,8};
        System.out.println("maximum sum="+subArray(array));
    }
}
