public class searchinSortedmarix {

    public static boolean searchinSortedmarixx(int matrix[][],int key){

  int row=0;
  int col=matrix[0].length-1;

  while (row<matrix.length&&col>=0) {
    if(matrix[row][col]==key){
        System.out.println("key found at  "+row+" "+col);
        return true;
    }
    else if(key< matrix[row][col]){
        col--;
    }
    else{
        row++;
    }
}
System.out.println("key not found");
return false;
    




    }
    public static void main(String[] args) {
        



        int matrix [][]={
            {10,20,30,40},
            {15,25,35,45},
            {20,30,40,50},
            {25,35,45,55}
        };

        int key=35;
        searchinSortedmarixx(matrix,key);

    }
}
