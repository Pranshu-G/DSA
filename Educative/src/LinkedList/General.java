package LinkedList;

import java.util.HashSet;

public class General {
    public static <T> void reverse(SinglyLinkedList<T> list){
        //Write -- Your -- Code

        SinglyLinkedList<T>.Node curr = list.head,prev=null,nextN=null;
        while(curr!=null){
            nextN=curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextN;
        }
        list.head = prev;
    }

    public static <T> boolean detectLoop(SinglyLinkedList<T> list) {
        //Write -- Your -- Code
        SinglyLinkedList<T>.Node fast = list.head, slow = list.head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }

        return false;
    }

    public static <T> Object findMiddle(SinglyLinkedList<T> list){
        SinglyLinkedList<T>.Node slow = list.head, fast = list.head;
        while(fast!=null && slow.next!=null && fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
        // Write -- Your -- Code

        SinglyLinkedList<T>.Node head = list.head;
        HashSet<T> set = new HashSet<>();
        SinglyLinkedList<T>.Node temp = head;
        SinglyLinkedList<T>.Node prev = head;
        while(temp!=null && temp.next!=null){
            if(set.contains(temp.data)){
                SinglyLinkedList<T>.Node duplicate = temp.next;
                if(temp.next.next!=null){
                    temp.next = temp.next.next;
                }
                else{
                    temp.next = null;
                }
                duplicate.next = null;
            }
            else{
                set.add((T) temp.data);
            }
            prev = temp;
            temp= temp.next;
        }
    }

}
