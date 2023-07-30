import java.util.ArrayList;
import java.util.Scanner;

public class question {
    public static boolean ismonotonicin(ArrayList<Integer> list ){

        boolean var=false;
        //1 2 3     3 2 1   5 6 1 
          for (int i = 0; i <list.size()-1; i++) {
            if(list.get(i)<=list.get(i+1)){
                var=true;
            }
            else var=false;
            
          }

        return var;

    }

    public static ArrayList<Integer> lonleyNo(ArrayList<Integer> list){

        ArrayList<Integer> ans=new ArrayList<>();
        int var=0;
        for (int i = 0; i <list.size(); i++) {
            for (int j =0; j < list.size(); j++) {
                if((list.get(i)+1)!=list.get(j)&&(list.get(i)-1)!=list.get(j)&&(i!=j)&&(list.get(i)!=list.get(j))){
                    var=list.get(i);
                }
            }
            ans.add(var);
            
        }
        return ans;
    }


    public static void main(String[] args) {
        
          ArrayList<Integer> list= new ArrayList<>();
          Scanner sc=new Scanner(System.in);
          System.out.println("enter no=");
          for (int i = 0; i <4; i++) {
             
            list.add(sc.nextInt());
          }

        System.out.println(list);
      //  System.out.println(ismonotonicin(list));

      System.out.println(lonleyNo(list));
    }
}
