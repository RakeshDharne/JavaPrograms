import java.util.ArrayList;

public class eight {

    //pair sum

    public static boolean pairSum(ArrayList<Integer> list,int key){

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                
                if(list.get(i)+list.get(j)==key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(pairSum(list,17));

    }
}
