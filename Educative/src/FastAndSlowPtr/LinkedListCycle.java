package FastAndSlowPtr;

import LinkedList.SinglyLinkedList;

;

public class LinkedListCycle {
    public static boolean detectCycle(SinglyLinkedList.Node head) {
        // Write your code here
        SinglyLinkedList.Node slow = head;
        SinglyLinkedList.Node fast = head;

        while(fast!=null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        for(int i=0;i<=10;i++){
            sll.insertAtEnd(i);

        }
        SinglyLinkedList.Node temp = sll.head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next = sll.head;
        boolean ans = detectCycle(sll.head);
        System.out.println(ans);
    }

}
