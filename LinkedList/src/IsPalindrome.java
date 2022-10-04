import java.util.Scanner;

public class IsPalindrome {

    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here
        Node<Integer>curr = head;
        Node<Integer>prev = null,next=null,tail = null,temp1=head,temp2=null;
        Node<Integer>temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        tail = temp;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        temp1 = prev;

        return false;
    }

    public void reverseIterate(Node<Integer> head){
        
    }
    public static Node<Integer> takeInput(){
        Node<Integer> head = null,tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while(data!=-1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
//                Node<Integer> temp = head;
//                while(temp.next!=null){
//                    temp = temp.next;
//                }
//                temp.next  = newNode;

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

  }
}
