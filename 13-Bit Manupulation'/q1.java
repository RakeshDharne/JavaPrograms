public class q1 {


    public static int addOnetoNo(int n) {
        return n|1;//question 3
        
    }

    public static int exponential(int a,int n ) {
      

        int ans=1;
            while(n>0){
                if((n&1)!=0){  //check lsb

                    ans=ans*a;
                }
                a=a*a;
                n=n>>1;
            }
            return ans;


            
        
    }


    public static void main(String[] args) {
        //System.out.println(addOnetoNo(4));

        System.out.println(exponential(5, 5));
        
    }
}
