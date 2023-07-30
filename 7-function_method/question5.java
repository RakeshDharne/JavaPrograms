public class question5 {
    public static int  intergersum(int no) {
       int sum=0;
       while(no>0){
        sum=sum+(no%10);
        no/=10;
       }
       return sum;
        
    }
    public static void main(String[] args) {
     System.out.println(intergersum(1111));   
    }
    
}
