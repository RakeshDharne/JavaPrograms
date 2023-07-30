import java.util.ArrayList;

public class fifth {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mArrayLists=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();

        for(int i=0;i<5;i++){

            list1.add(i);
        }
        mArrayLists.add(list1);
                ArrayList<Integer> list2=new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    list2.add(2*i);
                }
        mArrayLists.add( list2);
                ArrayList<Integer> list3=new ArrayList<>();
                for (int i = 0; i <5; i++) {
                    list3.add(3*i);
                    
                }
                list3.remove(3);
                mArrayLists.add(list3);

                for (int i = 0; i < mArrayLists.size(); i++) {
                            ArrayList<Integer> cuArrayList=mArrayLists.get(i);
                            for (int j = 0; j <cuArrayList.size() ; j++) {
                                System.out.print(cuArrayList.get(j));
                            }
                            System.out.println();

                }
                System.out.println(mArrayLists);

        


    }
    
}
