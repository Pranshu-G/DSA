public class UnionOfLL {

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

    public static Node<Integer> unionOfLL(Node<Integer>head1,Node<Integer>head2){
        Node temp = head1;
        while(temp.next!=null){
            temp = temp.next;
        }
        if(head2!=null) {
            temp.next = head2;
        }
        return head1;

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
        Node<Integer> five = new Node(50);
        Node<Integer> six = new Node(60);
        five.next = six;

        Node<Integer> seven = new Node(70);
        Node<Integer> eight = new Node(80);
        six.next = seven;
        seven.next = eight;

        eight.next = null;
        traverseSinglyLinkedList(one);
        traverseSinglyLinkedList(five);
        Node head =unionOfLL(one,five);
        traverseSinglyLinkedList(head);
    }
}
