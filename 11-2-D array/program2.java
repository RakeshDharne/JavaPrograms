public class program2 {

    public static int  sumofMatrix(int matrix[][]) 
    {
        //brute force
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==j){
                  sum+=matrix[i][j];  
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][matrix.length-1];
                }
            }
        }

        System.out.println(sum);
        return sum;
        
    }

 

    void immediateSmaller(int arr[], int n) {
        // code here
        for (int i = 0; i < arr.length; i++) {
          
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i+1]);
            }
            else{
                System.out.println("-1");
            }
        }





    }






    public static void main(String[] args) {
        int matrix[][]={{     1,2,3,4},{4,3,2,1},{7,8,9,4},{9,8,5,1}};
        sumofMatrix(matrix);
    }
    
}
