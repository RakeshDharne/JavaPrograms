public class third {

    public static int fibonacchi(int N) {
        if(N==0||N==1){
            return N;
        }
        int fnm1= fibonacchi(N-1);
        int fnm2=fibonacchi(N-2);
        return fnm1+fnm2;
    }



    public static void main(String[] args) {
        
        System.out.println(fibonacchi(2));
    }
}
