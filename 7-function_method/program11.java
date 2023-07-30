public class program11 {
    
    public static int  bintoDec(int no) {
        int bin=0;
        int pow=0;
        while (no>0) {

            bin =bin+(int )((no%2)*Math.pow(10,pow));
            pow++;
            no/=2;
            
            
        }
        return bin;
        
    }


    public static void main(String[] args) {
        System.out.println("enter binary  number=");
        System.out.println(bintoDec(100));



    }
    
}
