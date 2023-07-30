import java.util.ArrayList;

public class tenth {
// sorted and rorated 
    public static boolean pairSum2(ArrayList<Integer> list ,int target){

        int lp=0;
        int rp=0;
        int n=list.size();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>list.get(i+1)){

                lp=i+1;
                rp=i;
                break;
            }
        }




        while(lp!=rp) {

            if (list.get(lp)+list.get(rp)==target) {
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else
            {
                rp=(rp+n-1)%n;
            }
                
        }
        return false;
            




    }


    public static void main(String[] args) {
        //11 15 6 8 9 10
          ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        
        System.out.println(pairSum2(list,19));
    }
}
