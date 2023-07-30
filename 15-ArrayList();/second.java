import java.util.ArrayList;

public class second {

    public static void swap(ArrayList<Integer> list,int indx1, int indx2){

        int temp=list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        swap(list, 0, 4);
        System.out.println(list);

    }
}
