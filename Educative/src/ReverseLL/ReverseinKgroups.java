package ReverseLL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseinKgroups {


    public static List<SinglyLinkedList.Node> reverse(SinglyLinkedList.Node head, int k){
        SinglyLinkedList.Node curr=head, prev=null,next=null;
        int count = 0;
        while(curr!=null && count<k){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        List<SinglyLinkedList.Node> res = Arrays.asList(prev,curr,next);
        return res;
    }

    public static int findLength(SinglyLinkedList.Node head){
        int length=0;
        while(head!=null){
            head=head.next;
            length++;
        }

        return length;
    }

    public static SinglyLinkedList.Node reverseLinkedList(SinglyLinkedList.Node head, int k) {
        // Write your code here
        // Tip: You may use some of the code templates provided
        // in the support files

        if(head==null||k<=1){
            return head;
        }
        int count=0;
        SinglyLinkedList.Node curr = head,prev=null,lastNodePrevPart=null,lastNodeCurrPart=null;
        int length = findLength(head);
        while(true){
            lastNodePrevPart=prev;
            lastNodeCurrPart=curr;
            SinglyLinkedList.Node next = null;
            List<SinglyLinkedList.Node> res = reverse(curr,k);
            prev = res.get(0);
            curr=res.get(1);
            next=res.get(2);
            count+=k;
            if(lastNodePrevPart!=null){
                lastNodePrevPart.next=prev;
            }
            else{
                head=prev;
            }
            lastNodeCurrPart.next=curr;
            if(curr==null || length-count<k){
                break;
            }
            prev=lastNodeCurrPart;
        }
        return head;
    }

    public static SinglyLinkedList.Node reverseLinkedListNeetCode(SinglyLinkedList.Node head, int k) {
       if(head==null || k==1){
           return head;
       }

        SinglyLinkedList sll = new SinglyLinkedList<>();
        SinglyLinkedList.Node dummy = sll.new Node();
        dummy.data = 0;
        dummy.next= head;
        SinglyLinkedList.Node curr = dummy, next = dummy, pre = dummy;
        int count=0;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        while(count>=k){
            curr = pre.next;
            next = curr.next;
            for(int i =1;i<k;i++){
                curr.next = next.next;
                next.next = pre.next;
                pre.next = next;
                next = curr.next;
            }
            pre = curr;
            count-=k;
        }
        return dummy.next;

    }

    public static SinglyLinkedList.Node getKth(SinglyLinkedList.Node curr, int k){
        while(curr!=null && k>0){
            curr=curr.next;
            k--;
        }
        return curr;
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

    }

}
