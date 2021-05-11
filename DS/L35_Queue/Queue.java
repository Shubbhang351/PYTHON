package DS.L35_Queue;

public class Queue {
    
    private int[] data;
    private int front;
    private int size;

    public Queue(){
        data = new int[5];
        front = 0;
        size = 0;
    }

    public Queue(int cap){
        data = new int[cap];
        front = 0;
        size = 0;
    }

    public void enqueue(int item)throws Exception{

        if(isFull()){
            throw new Exception("Queue is Full.");
        }

        int idx = (front + size) % data.length;
        data[idx] = item;
        size++;
    }

    public int dequeue()throws Exception{

        if(isEmpty()){
            throw new Exception("Queue is Empty.");
        }

        int item = data[front];
        data[front]  = 0;

        front = (front + 1 ) % data.length;
        size--;
        return item;
    }

    public int getfront(){
        return data[front];
    }

    public int size(){
        return size;
    }

    public boolean isFull(){
        return size() == data.length;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void display(){
        System.out.println("-------------------");
        
        for(int i = 0;i < size;i++){
            int idx = (i + front) % data.length;
            int item = data[idx];
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("-------------------");
    }
}
