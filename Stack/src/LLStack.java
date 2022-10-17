public class LLStack {
    LinkedList linkedList;

    public LLStack(){
        linkedList = new LinkedList();
    }

    // Push Method
    public void push(int value){
        linkedList.insertInLinkedList(value,0);
        System.out.println("inserted value" + value +  "in stack");
    }

    // isEmpty method
    public boolean isEmpty(){
        if(linkedList.head == null){
            return true;
        }
        else{
            return false;
        }
    }

//pop method
    public int pop(){
        int result = -1;
        if(isEmpty()){
            System.out.println("the stack is empty");
        }
        else{
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    //peek method
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else{
            return linkedList.head.value;
        }
    }

    public void deleteStack(){
        linkedList.head = null;
        System.out.println("the Stack has been deleted");
    }
}
