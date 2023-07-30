import java.util.ArrayList;

public class nine {
    ///two pointer approach
    public static boolean pairSum(ArrayList<Integer> list,int key){

        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp) {
            if(list.get(lp)+list.get(rp)==key){
                return true;
            }
            if(list.get(lp)+list.get(rp)<key){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return false;

        
    }
    public static void main(String[] args) {
        //1 2 3 4 5 
          ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(pairSum(list,6));
    }
}
