package ReverseLL;

public class ReverseLL {
    public static SinglyLinkedList.Node reverse(SinglyLinkedList.Node head) {

        SinglyLinkedList.Node curr = head, prev = null, next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Your code will replace this placeholder return statement
        return prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.printList();
        for(int i=0;i<=10;i++){
            sll.insertAtEnd(i);

        }
        sll.printList();

        SinglyLinkedList.Node result = reverse(sll.head);
        while(result!=null){
            System.out.print(result.data + " ");
            result=result.next;
        }
    }
}
