package Bind75;

import Bind75.SinglyLinkedList.Node;

public class NthNodeFromLast {
    public Node removeNthFromEnd(Node head, int n) {
            Node fast = head, slow = head;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }

            while(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return head;
    }
}
