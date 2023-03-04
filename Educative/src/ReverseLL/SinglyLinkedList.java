package ReverseLL;

public class SinglyLinkedList<T> {
    public class Node{
        public T data;
        public Node next;
    }

    public Node head;
    public int size;

    public SinglyLinkedList(){
        head = null;
        size=0;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void insertAtHead(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void printList(){
        if(isEmpty()){
            System.out.println("The list is Empty");
            return;
        }

        Node temp = head;
        System.out.print("List: ");
        while(temp.next!=null){
            System.out.print(temp.data.toString()+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.data.toString() + " -> null ");
    }

    public void insertAtEnd(T data) {
        // Write -- Your -- Code
        if(isEmpty()){
            Node newNode = new Node();
            newNode.data = data;
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node temp2 = new Node();
        temp.next = temp2;
        temp2.data = data;
        size++;
    }


    void deleteAtHead(){
        if(isEmpty()){
            return;
        }
        head = head.next;
        size--;
    }
    void deleteByValue(T data){
        if(isEmpty()){
            System.out.println("Empty Linked List");
            return;
        }
        Node temp = head;
        if(temp.data==data){
            deleteAtHead();
            return;
        }

        while(temp!=null){
            if(temp.next.data==data){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
/*
  Node currentNode = this.headNode;
        Node prevNode = null; //previous node starts from null

        if(currentNode.data.equals(data)) {
            //data is at head so delete from head
            deleteAtHead();
            return;
        }
        //traverse the list searching for the data to delete
        while (currentNode != null) {
            //node to delete is found
            if (data.equals(currentNode.data)){
                prevNode.nextNode = currentNode.nextNode;
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }
 */
    }

    public int length(){
            if(head==null){
                return 0;
            }
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
    }

    boolean searchNode(T data){
        if(isEmpty()){
            System.out.println("The list is Empty");
            return false;
        }

        Node temp = head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

}
