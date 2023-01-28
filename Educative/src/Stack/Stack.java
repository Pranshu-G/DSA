package Stack;

public class Stack <V>{
    private int maxSize;
    private int top;
    private V arr[];


    @SuppressWarnings("unchecked")
    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
        arr =(V[]) new Object[maxSize];
    }

    public int getCapacity(){
        return maxSize;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top==maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }

    public V top(){
        if(isEmpty()){
            return null;
        }
        return arr[top];
    }

    public void push(V element){
        if(isFull()){
            return;
        }
        arr[top+1] = element;
        top++;
    }

    public V pop(){
        if(isEmpty()){
            return null;
        }
        V ele = arr[top];
        arr[top] = null;
        top--;
        return ele;
    }


    public static void main( String args[] ) {
        Stack<Integer> stack = new Stack<Integer>(10);

        //output if stack is empty or not
        stack.push(10);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
    }


}
