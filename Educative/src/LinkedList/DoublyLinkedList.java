package LinkedList;

public class DoublyLinkedList<T>{

    public class Node{
        public T data;
        public Node next;
        public Node prev;
    }

    public Node head;
    public int size;

    public DoublyLinkedList(){
        this.head = null;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    public void insertAtHead(T data) {
        //create node and put in the data
        Node newNode = new Node();
        newNode.data = data;
        // Make next of new node as head and previous as NULL
        newNode.next = this.head;
        newNode.prev = null;
        //Change previous of head node to new node
        if (head != null)
            head.prev = newNode;
        this.head = newNode;
        size++;
    }

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
    //deletes the first element
    public void deleteAtHead(){
        //if list is empty do nothing
        if(isEmpty())
            return;

        //if List is not empty then link head to the
        //nextElement of firstElement.
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteByValue(T data){

        if(head==null){
            System.out.println("The DLL is empty");
            return;
        }
        if(head.data==data){
            deleteAtHead();
            return;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.data==data){
                Node prevNode=temp.prev;
                Node nextNode = temp.next;
                prevNode.next = nextNode;
                nextNode.prev = prevNode;
                temp.next = null;
                temp.prev = null;
                size--;
                return;
            }
            else{
                temp = temp.next;
            }
        }
    }

}
