public class a3 {
    //check if number is a power of 2 or not

    public  static boolean powerOfTwo(int n)
    {
        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        powerOfTwo(10);
    }
    
}
