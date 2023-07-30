public class program7 {
//sub array 

    public static void pairs(int array[]) {
        int tp=0;

        for (int i = 0; i < array.length; i++) {

            //curr =number[i];//
            for (int j =i+1; j <  array.length; j++) {
                System.out.print("("+array[i]+","+array[j]+")"+" ");
                tp++;
            }
            System.err.println();
        }
        System.out.println("total pairs = "+tp);
        
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        pairs(array);
    }
}
