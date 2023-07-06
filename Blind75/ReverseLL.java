package Blind75;

import Blind75.SinglyLinkedList.Node;

public class ReverseLL {
    public static SinglyLinkedList.Node reverse(SinglyLinkedList.Node head){
            Node prev=null,next = null, curr =head;
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
    }

}
