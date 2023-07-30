public class a4 {

    //chreck the last bit 


    public static void checkSetBit(int n){

        int count=0;
        while(n>0){
            if((n&1)!=0){//check our lsb

                count++;
            }
            n=n>>1;
        }
    }

        public static int FastExpo(int a,int n) {

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
        
        //checkSetBit(15);
        
        System.out.println(FastExpo(3, 5));
    }
}
