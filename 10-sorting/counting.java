public class counting {
 
    public static void sorting(int arr[]) {
    
     //pending
     
        
    }

   public static int MissingNumber(int array[], int n) {
    
    
    // Your Code Here
     int val=0;
    for (int i = 0; i < array.length; i++) {
        for (int j = 1; j <=n; j++) {
            if(array[i]==array[j]){
                val=j;
                continue;
            }
        }
    }
    return val;
    }


    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum1=0;
        int  sum2=0;
        double mid=n/2; 
        int rd=(int )Math.ceil(mid);
        for (int i = 0; i < rd; i++) {

            sum1+=arr[i];
        }
        for (int i =rd+1; i < arr.length; i++) {
            sum2+=arr[i];
        }
        if(sum1==sum2){
            return rd;
        }
        if(n<2){
            return n;
        }
        else{
            return -1;

        }

            

           
    }


    public static void main(String[] args) {
     
        
        
    }
}
