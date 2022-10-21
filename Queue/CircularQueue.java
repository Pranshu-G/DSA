package Queue;

public class CircularQueue {
    int arr[];
    int topOfTheQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.topOfTheQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
        System.out.println("The circular queue has been successfully created with size "  + size);
    }

    public boolean isEmpty(){
        if(topOfTheQueue==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(topOfTheQueue+1 == beginningOfQueue){
        return true;
    }
    else if(beginningOfQueue ==0 && topOfTheQueue+1 ==size){
        return true;
    }else{
            return false;
        }
    }

    public void enQueue(int value){
            if(isFull()){
                System.out.println("the queue is full");
            }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfTheQueue++;
            arr[topOfTheQueue] = value;
            System.out.println("Successfully inserted value "  + value);
        }
        else{
            if(topOfTheQueue+1 ==size){
                topOfTheQueue = 0;
            }
            else{
                topOfTheQueue++;
            }
            arr[topOfTheQueue] = value;
            System.out.println("Successfully inserted value "  + value);
        }
    }

    //dequeue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else{
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if(beginningOfQueue==topOfTheQueue){
                beginningOfQueue= topOfTheQueue = -1;
            }
            else if (beginningOfQueue +1 ==size){
                beginningOfQueue = 0;
            }else{
                beginningOfQueue++;
            }
            return result;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else{
            return arr[beginningOfQueue];
        }

    }
    public void deleteQueue(){
        arr = null;
    }

}