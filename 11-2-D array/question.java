public class question {

    ///Brute force

    public static int findtheNumber(int matrix[][],int key) {
        int count=0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if(matrix[row][col]==key){
                   count++; 

                }
            }
        }
        return count;
        
    }
    
    public static int sumofSecondrow(int matrix[][]) {
        // int row=1;
        int col=0,sum=0;
        while (col<matrix[0].length) {
            sum+=matrix[1][col];
            col++;
        }
        return sum;
            

        
    }

    public static void tranposeofMatrix(int matrix[][]) {
        
        
    }
    


    public static void main(String[] args) {
        int matrix [][]={
            {10,7,40},
            {15,25,7}
        };

        int key=7;
        System.out.println(sumofSecondrow(matrix)); 
        System.out.println(findtheNumber(matrix, key)); 
        
    }
}
