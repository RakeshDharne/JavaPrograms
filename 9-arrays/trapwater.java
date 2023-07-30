/**
 * leetcode
 */
public class trapwater {


    public static void name(int height[]) {
        
        // if(height.length<=2)
        // {
        //     System.out.println("water trap =0");
        // }

        // for (int i = 0; i < height.length; i++) {
        //    if(height[i]>=height[i+1]||height[i]<=height[i+1]){
        //     System.out.println("water trapped =0");
        //    }
        // }

         //calculate left max boundary
        int lefttmax[]= new int[height.length];
        lefttmax[0]=height[0];

        for (int i = 1; i < height.length; i++) {
            lefttmax[i]=Math.max(height[i], lefttmax[i-1]);

        }
        //calculate right max boundary

    
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for (int i=height.length-2 ; i>=0; i--) {
           
               rightmax[i]=Math.max(height[i], rightmax[i+1]);
          
            
        }
         int trappedwater=0;
        for (int i = 0; i < height.length; i++) {
           int waterlevel=Math.min(lefttmax[i],rightmax[i]);
           trappedwater+=waterlevel-height[i];
            
        }
        System.out.println("total rain water collected="+trappedwater);

         

        return;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        name(height);
        
    }
}