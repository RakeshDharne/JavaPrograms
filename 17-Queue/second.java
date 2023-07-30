//Circular queue

public class second {

    static class Queue{
        static int front;
        static int rear;
        static int size;
        static int arr[];

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;

        }
        public static boolean isEmpty(){
            return (rear==-1&&front==-1);
        }
        
        //is full
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //add 
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            //add first element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result=arr[front];
            //remove last element
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;

        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
                
            }
            return arr[front];
        }
            
    }
    
    public static void main(String[] args) {
        
        Queue q= new Queue(6);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.remove();
        q.add(70);
   
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}
