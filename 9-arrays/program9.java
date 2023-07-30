
//sub array
//minimum sum of sub array

public class program9 {
    
    public static int subArray(int array[]) {
        int ts=0;
        int min=Integer.MAX_VALUE;
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
                 if(sum<min){
                    min=sum;
                 }
                 ts++;
                 System.out.println();
                
            }

            System.out.println();
        } 

        System.out.println("total sub array="+ts);
        return min;
    }






    public static void main(String[] args) {
        int array[]={3,4,5,6,7,8};
        System.out.println("minimum sum="+subArray(array));
    }
}
