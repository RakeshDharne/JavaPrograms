public class second {
    ///
    public static int sumOfnaturalno(int N) {
     
        
        if(N==1){
            return 1;

        }
        int ans =N+ sumOfnaturalno(N-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sumOfnaturalno(5));
    }
}
