import java.util.Scanner;

/**
 * program1
 */
public class program1 {

    public static boolean printArray(int matrix[][],int key) {
      
 
        boolean var =false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
                if(matrix[i][j]==key){

                    var=true;

                }
            }
            System.out.println();
        }
        return var;
        
    }


    public static int  largestElement(int matrix[][]) {

        int max=Integer.MIN_VALUE;
        for (int  i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        return max;
        
    }

    public static int  smalllestElement(int matrix[][]) {

        int min=Integer.MAX_VALUE;
        for (int  i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        return min;
        
    }
    public static void main(String[] args) {
        int matrix [][]=new int [3][3];//array deceleration
        Scanner sc= new Scanner(System.in);
        //int row=matrix.length
        //int column =matrix[0].length
        System.out.println("enter all elements of array");
        for (int i = 0; i < matrix.length; i++) {//for row 
            

            for (int j = 0; j < matrix[0].length; j++) {//for column
                
                matrix[i][j]=sc.nextInt();
            }
        }
   
    System.out.println(printArray(matrix,10)+"");
    System.out.println("largest element="+largestElement(matrix));
    System.out.println("smallest element="+smalllestElement(matrix));
        
    }

    






}