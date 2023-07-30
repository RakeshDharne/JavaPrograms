public class gfg {

    void immediateSmaller(int arr[], int n) {
        // code here
        
        
           for (int i = 0; i <= n-2; i++) {
          
            if(arr[i]>arr[i+1]){
                System.out.print(arr[i+1]+" ");
            }
            else{
                System.out.print("-1"+" ");
            }
            
        }
        System.out.print("-1"+" ");
        
    }

  
    bool IsPerfect(int a[],int n)
    {
        // Complete the function

        int tmp[]=new int[a.length];
        boolean var=true;
        int st=0;
        int ed=a.length-1;
        while (st<ed) {
            int tmp1;
            tmp1=a[ed];
            a[ed]=a[st];
            a[st]=tmp1;
            st++;
            ed--;
            
        } 
        for (int i = 0; i < tmp.length; i++) {
            if(tmp[i]!=a[i]){
                var=false;
               break;
            }
            
        }
        return var;


    }




    int print2largest(int arr[], int n) {
        // code here
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int  i = 0; i < arr.length; i++) {
            
            if(max<arr[i]){
                max=arr[i];

            } 
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max&&arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
        
    }



    public static void main(String[] args) {
        

        int arr[]={4,2,1,5,3};
         immediateSmaller(arr,5);
    }
}
