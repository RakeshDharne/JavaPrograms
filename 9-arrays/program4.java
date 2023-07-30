public class program4 {


    public static int getLargest(int numbers[]) {

        //largest number in array
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest<numbers[i]) {
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
              
                
                
        }
        System.out.println("smallest value="+smallest);
        return largest;
        
    }
    public static void main(String[] args) {
         int numbers[]={1,2,3,4,5,666,7,8,9};
         System.out.println("largest numbern in array="+getLargest(numbers));

    }
}
