package FastAndSlowPtr;

import LinkedList.SinglyLinkedList;

public class midOfLL {

    public static SinglyLinkedList.Node middleNode(SinglyLinkedList.Node head) {
        // Write your code here
        SinglyLinkedList.Node slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
