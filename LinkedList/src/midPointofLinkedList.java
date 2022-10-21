public class midPointofLinkedList {
 //midpoint of a LL
 public static Node<Integer> midPoint(Node<Integer> head) {
     //Your code goes here
     Node fast=head;
     Node slow=head;

     while(fast!=null &&fast.next!=null){
         slow = fast.next;
         fast = fast.next.next;
     }
     return slow;
 }
    public static void main(String[] args){
     Node<Integer> head = new Node<>(10);
     Node<Integer> newN = new Node<>(20);
     head.next = newN;
     Node<Integer> newN2 = new Node<>(30);
     newN.next = newN2;
     Node ans = midPoint(head) ;
     System.out.println(ans.data);
 }
}