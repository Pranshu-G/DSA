package Queue;

public class Queue<V>{

    int maxSize;
    V[] arr;
    int front;
    int back;
    int currentSize;

    @SuppressWarnings("unchecked")
    public Queue(int maxSize){
        arr = (V[])new Object[maxSize];
        this.maxSize = maxSize;
        front = 0;
        back = -1;
        currentSize = 0;
    }

    public int getMaxSize(){
        return maxSize;
    }

    public int getCurrentSize(){
        return currentSize;
    }

    public boolean isEmpty(){
        if(currentSize==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(currentSize==maxSize){
            return true;
        }
        else{
            return false;
        }
    }

    public V top(){
        return arr[front];
    }

    public void enqueue(V value){
        if(isFull()){
            System.out.println("The queue is full");
            return;
        }
        back = (back+1) % maxSize;
        arr[back] = value;
        currentSize++;
    }

    public V dequeue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return null;
        }
        V val = arr[front];
        front = (front+1)%maxSize;
        currentSize--;
        return val;
    }
}
