public class program10 {


    public static int  bintodeciaml( int no) {

        int dec=0;
        int ld;
        int pow=0;///or int i=0;
        while(no>0){
         ld=no%10;    
         dec=dec+ld*(int )(Math.pow(2,pow ) );
         no=no/10;
         pow++;
        }
        return dec;
        
    }
   public static void main(String[] args) {
    //convert a number from binary to decimal+
    System.out.println(bintodeciaml(101));
   }
}
 