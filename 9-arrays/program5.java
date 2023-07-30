public class program5 {

    public static int binarysearch(int numbers[],int key) {

        int start=0;
        int end=numbers.length-1;
        while (start>=end) {
            int mid=(start+end)/2;
            //comparision
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                //right
                start=mid+1;
            }else{//left
                end=mid-1;
            }
        }
          
            
           
        return -1;
        
        

        
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int key=10;
        System.out.println("position ="+binarysearch(number,key));
    }
}
