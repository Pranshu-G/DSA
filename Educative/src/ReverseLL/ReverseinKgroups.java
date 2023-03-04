package ReverseLL;

import java.util.Arrays;
import java.util.List;

public class ReverseinKgroups {
    public static SinglyLinkedList.Node reverseLinkedList(SinglyLinkedList.Node head, int k) {
        // Write your code here
        // Tip: You may use some of the code templates provided
        // in the support files
        int noOfNodes=0;
        SinglyLinkedList.Node temp = head;
        while(temp!=null){
            noOfNodes++;
            temp=temp.next;
        }

        if(noOfNodes<k){
            return head;
        }
        if(k==1){
            return head;
        }
        SinglyLinkedList.Node curr =head, prev=null,next=null;
        int count =0;
        while(count!=k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        SinglyLinkedList.Node t = prev;
        while(t.next!=null){
            t=t.next;
        }
        t.next=curr;
        reverseLinkedList(curr,k);
        return prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.printList();
        for(int i=1;i<=8;i++){
            sll.insertAtEnd(i);

        }
        sll.printList();
        System.out.println(sll.head.data);
//
//        SinglyLinkedList.Node result = reverseLinkedList(sll.head, 2);
//        while(result!=null){
//            System.out.print(result.data + " ");
//            result=result.next;
//        }
        List<SinglyLinkedList.Node> res = reverseTest(sll.head,3);
        for(SinglyLinkedList.Node i: res){
            System.out.print(i.data + " ");
        }
    }
    public static List<SinglyLinkedList.Node>  reverseTest(SinglyLinkedList.Node head, int k)
    {
        SinglyLinkedList.Node previous = null;
        SinglyLinkedList.Node current = head;
        SinglyLinkedList.Node next = null;
        int index = 0;
        while(current != null && index < k)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            index += 1;
        }
        List<SinglyLinkedList.Node> resultList = Arrays.asList(previous, current, next);
        return resultList;
    }
}
