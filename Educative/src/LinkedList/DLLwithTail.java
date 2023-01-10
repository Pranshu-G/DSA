package LinkedList;

public class DLLwithTail<T>{
    public class Node {
        public T data;
        public Node next;
        public Node prev;
    }

    public Node head;
    public Node tail;
    public int size;

    public DLLwithTail() {
        this.head = null;
        this.tail = null; //null initially
        this.size = 0;
    }

    //returns true if list is empty
    public boolean isEmpty() {
        if (head == null && tail == null) //checking tail to make sure
            return true;
        return false;
    }

    //getter for head
    public Node getHeadNode() {
        return head;
    }

    //getter for tail
    public Node getTailNode() {
        return tail;
    }

    //getter for size
    public int getSize() {
        return size;
    }

    //print list function
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = head;
        System.out.print("List : null <- ");

        while (temp.next != null) {
            System.out.print(temp.data.toString() + " <-> ");
            temp = temp.next;
        }

        System.out.println(temp.data.toString() + " -> null");
    }

    public void insertAtHead(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = this.head;
        newNode.prev = null;
        if(!isEmpty()){
            head.prev = newNode;
        }
        else{
            tail = newNode;
        }

        this.head = newNode;
        size++;
    }

    public void insertAtEnd(T data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
           insertAtHead(data);
           return;
        }

        this.tail.next = newNode;
        newNode.prev = this.tail;
        newNode.next = null;
        tail = newNode;
        size++;
    }

    public void deleteAtHead(){
        if(isEmpty()){
            return;
        }
        head = head.next;
        if(head==null){
            tail=null;
        }
        else{
            head.prev = null;
        }
        size--;
    }

    public void deleteAtTail(){
        if(isEmpty()){
            System.out.println("The list is Empty");
            return;
        }

        tail = tail.prev;
        if(tail==null){
            head=null;
        }
        else{
            tail.next=null;
        }
        size--;
    }


}
