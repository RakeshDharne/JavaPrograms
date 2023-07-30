
//Queue using 2 stack 

import java.util.*;


public class sixth {

    static class Queue {

       static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            if (s1.isEmpty()) {
                
                
                return true;
            }
            else{
                return false;
            }
        }

        //add 
        public static void add(int data){
       

            while ((!s1.isEmpty())) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
                
            }

            }

            // remove
        public static int remove(){
            
            if(s1.isEmpty()){
                
                return -1;
            }
            return s1.pop();

        } 
        //peek 
        public static int peek(){
            if (s1.isEmpty()) {
                return-1;
                
            }
            return s1.peek();
        }


                



    }

    public static void main(String[] args) {

        Queue q=new Queue();
        q.add(0);
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        

                

        

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }

    }
}
