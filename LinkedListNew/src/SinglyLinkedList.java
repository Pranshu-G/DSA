public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    public void insertSinglyLinkedList(int nodeValue,int location){
        Node newNode = new Node();
        newNode.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if(location==0){
            newNode.next = head;
            head = newNode;
        }
        else if(location>=size){
            newNode.next =  null;
            tail.next = newNode;
            tail = newNode;
        }
        else{
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if(head==null){
            System.out.println("Sll does not exist");
        }
        else{
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

}
