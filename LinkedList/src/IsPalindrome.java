import java.util.Objects;
import java.util.Scanner;

public class IsPalindrome {


    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here
        if(head==null){
            return true;
        }
        if(head.next == null){
            return true;
        }
        Node<Integer> slow = head, fast = head;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null) {
            Node<Integer> end = reverse(slow);
            while (end != null && head != null) {
                if (end.data == head.data) {
                    end = end.next;
                    head = head.next;
                } else {
                    return false;
                }
            }
        }
       else if(fast.next == null) {
            Node<Integer> end = reverse(slow);
            while (end.next.next != null && head.next != null) {
                if (end.data == head.data) {
                    end = end.next;
                    head = head.next;
                } else {
                    return false;
                }
            }
        }
        return true;

    }

    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer>curr=head,next = null, prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static Node<Integer> takeInput(){
        Node<Integer> head = null,tail=null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while(data!=-1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
//            Node<Integer> temp = head;
//            while(temp.next!=null){
//                temp = temp.next;
//            }
//            temp.next = newNode;
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

  public static void main(String[] args) {
    //

      Node<Integer> head = takeInput();
      System.out.println(isPalindrome(head));

  }
}
