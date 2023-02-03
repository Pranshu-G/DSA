package FastAndSlowPtr;

import LinkedList.SinglyLinkedList;

public class palindromeLL {

    public static boolean palindrome(SinglyLinkedList.Node head) {
        // Write your code here
        SinglyLinkedList.Node slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        SinglyLinkedList.Node temp = reverse(slow);
        SinglyLinkedList.Node temp2 = head;

        while(temp!=null){
            if(temp.data==temp2.data){
                temp=temp.next;
                temp2=temp2.next;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static SinglyLinkedList.Node reverse(SinglyLinkedList.Node head){
        SinglyLinkedList.Node curr=head,prev=null,nextNode= null;

        while(curr!=null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;

        }

        return prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.insertAtEnd(2);
        sll.insertAtEnd(3);
        sll.insertAtEnd(5);
        sll.insertAtEnd(3);
        sll.insertAtEnd(1);
//        sll.printList();
//        SinglyLinkedList.Node t = reverse(sll.head);
//        while(t!=null){
//            System.out.println(t.data);
//            t=t.next;
//        }
        SinglyLinkedList<Integer>.Node t = reverse(sll.head);
        System.out.println(t.next.data);
//        s.printList();

        boolean ans = palindrome(sll.head);
        System.out.println(ans);
    }
}
