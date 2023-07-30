public class program3 {

 

    public static int linearSearch(int numbers[],int key) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==key){
                return i;
            }
            
        }
        return -1;
    }
   public static String fsearch(String fruString[],String key) {
    String flg="true"   ;

    for (int i = 0; i < fruString.length; i++) {
       if(fruString[i]==key){
           
           return flg;
        }
        else{
            flg="false";
             return (flg);
        }
        
    }
    
   }

    public static void main(String[] args) {

        
        int numbers[]={2,4,6,8,10,12,1,54,6,66,66,656};
        String fruits[]={"mango","banana","pineapple","poapaya"};
        String key2="mango";
        int index=linearSearch(numbers,key);
        int key=656;
        String fsearch(fruits,key2);
        if (index==-1) {
            System.out.println("not exitst");
            
        } else {
           System.out.println(index);           
        }
    }
}
