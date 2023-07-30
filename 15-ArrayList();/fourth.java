import java.util.ArrayList;

public class fourth {



    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        mainList.add(list);

        ArrayList<Integer>list2=new ArrayList<>();

        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        mainList.add(list2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curreList=mainList.get(i);
            for(int j=0;j<curreList.size();j++){
                System.out.print(curreList.get(j)+" ");
            }
            System.out.println();
        }






        
    }
}
