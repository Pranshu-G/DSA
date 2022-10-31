public class LetLastBeFirst {

    public static Node<Integer> lastToFront(Node<Integer> head) {
        // Write your code here
        Node temp = head;
        Node temp2;
        while(temp.next.next!=null){
            temp = temp.next;
        }

        temp2 = temp.next;
        temp.next = null;
        temp2.next = head;
        head = temp2;
        return head;
    }

    public static void traverseSinglyLinkedList(Node head){
        int size=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(head==null){
            System.out.println("Sll does not exist");
        }

        else{
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.data);
                if(i!=size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Node<Integer> one = new Node(10);
        Node<Integer> two = new Node(20);
        one.next = two;
        Node<Integer> three = new Node(30);
        Node<Integer> four = new Node(40);
        two.next = three;
        three.next = four;
        four.next = null;
        traverseSinglyLinkedList(one);
        Node head = lastToFront(one);
        traverseSinglyLinkedList(head);

    }
}
