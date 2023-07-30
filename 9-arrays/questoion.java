public class questoion {

    public static boolean appearTwice(int nums[]) {

        int i;
        boolean var=false;
        for ( i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    var=true;
                
                }
            }
        }
        return var;
    }
        
        public static int maxProfit(int nums []) {
            
            int buy=nums[0];
            int profit=0;
            for (int j = 0; j < nums.length; j++) {
                

                if(buy<nums[j]){
                    profit=Math.max(nums[j]-buy, profit);
                }
                else{
                    buy=nums[j];
                }
            }

            return profit;
            
        }
        public static boolean check(long A[],long B[],int N)
        {
            
           int val=0;
           for (int i = 0; i < N; i++) {
                val=0;
               for (int j = 0; j < N; j++) {
                   if(A[i]==B[j]){
                   val=1;
                  
               }
                if(val==0){
                    return false;
                }
               
              }
           }

           
           return true;

               
    
           //Your code he
        }

        public static void rainwaterTarpping(){

        }
    
    public static void main(String[] args) {
        int  nums[]={7,1,5,3,6,4};
        System.out.println(appearTwice(nums));   
         
         System.out.println(maxProfit(nums));

    }
}
