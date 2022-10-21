package Queue;

public class QueueArray {

        int[] arr;
        int topOfQueue;
        int beginningOfQueue;

        public QueueArray(int size){
            this.arr = new int[size];
            this.topOfQueue = -1;
            this.beginningOfQueue = -1;
            System.out.println("Queue successfilly created with size " + size);
        }

    public boolean isFull(){
            if(topOfQueue == arr.length-1){
                return true;
            }
            else {
                return false;
            }
        }
        public boolean isEmpty(){
                if(beginningOfQueue==-1 || beginningOfQueue==arr.length){
                    return true;
                }
                else{
                    return false;
                }
            }

    public void enQueue(int value){
            if(isFull()){
                System.out.println("The queue is Full");
            }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " has been added to the queue");
        }
        else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " has been added to the queue");
        }
        }

    //deQueue
    public int deQueue(){
            if(isEmpty()){
                System.out.println("The queue is empty");
                return -1;
            }
        else{
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=-1;
                topOfQueue=-1;
            }
            return result;
        }
        }

    public int peek(){
            if(!isEmpty()){
                return arr[beginningOfQueue];
            }
            else{
               System.out.println("The queue is empty");
              return -1;
            }
         }

    public void deleteQueue(){
            arr = null;
            System.out.println("The queue is successfully deleted");
        }
        }
