package stack;

public class Stack {
     int tos;
     int[] data;
     int size;

    public Stack(){
        data = new int[5];
        tos = 0;
    }

    public Stack(int size){
        data = new int[size];
    }

    public void push(int item)throws Exception{
        if(isFull()){
            throw new Exception("Stack is Full");
        }
        data[tos++] = item;
        size++;
    }

    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int temp = data[--tos];
        size--;
        return temp;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public boolean isFull(){
        return size() == data.length;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
     String ans = "";
     for(int i = tos - 1;i >= 0;i--){
         ans =  ans + data[i] + " ";
     }
     return ans;
    }
}
