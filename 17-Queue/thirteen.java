
import java.util.*;
public class thirteen {


    //implement  queue using double ended queue

    /**
     * Stack
     */
    
     static  class Queue {
    
        Deque <Integer> dq=new LinkedList<>();
        public  void add(int data){
            dq.addLast(data);
        }
         public  int remove(){
            return dq.removeFirst();
        }
         public int  peek(){
            return dq.getFirst();
        }

        
    }
    public static void main(String[] args) {
        

        Queue s= new Queue();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.remove();
        s.remove();
        System.out.println("peak ="+ s.peek()+" ");





    }
}
