
import java.util.*;
public class twelve {


    //implement stack and queue using double ended queue

    /**
     * Stack
     */
    
     static  class Stack {
    
        Deque <Integer> dq=new LinkedList<>();
        public  void push(int data){
            dq.addLast(data);
        }
         public  int pop(){
            return dq.removeLast();
        }
         public int  peek(){
            return dq.getLast();
        }

        
    }
    public static void main(String[] args) {
        

        Stack s= new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        System.out.println("peak ="+ s.peek()+" ");





    }
}
