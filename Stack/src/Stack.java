public class Stack {

    int arr[];
    // topOfStack is used to store the index of the top element
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with the size of " + size);
    }

    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(topOfStack==arr.length-1){
            System.out.println("The stack is full");
            return true;
        }
        else{
            return false;
        }
    }

    public void push(int value){
        if(isFull()){
            System.out.println("The stack is full");
        }
        else{
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value has been successfully added");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("We have nothing to pop");
            return -1;
        }
        else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else{
            int topElement = arr[topOfStack];
            return topElement;
        }
    }

    public void deleteStack(){
        arr = null;
        System.out.println("The Stack is successfully deleted");

    }
}
