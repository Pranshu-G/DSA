import java.util.Scanner;

public class kReverse {

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
        Node<Integer> newHead = reverse(head,3);
        System.out.println();
        print(newHead);
    }

    public static Node<Integer> reverse(Node<Integer> head, int k) {

        int count =0;
        Node<Integer> temp = head;
        int length = 1;
        while(temp.next!=null){
            length++;
            temp = temp.next;
        }
        Node<Integer>prev=null,curr=head,next=null,headLink=head;
        while (count < k && curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null)
            head.next = reverse(next, k);

        // prev is now head of input list
        return prev;

    }

    public static void print(Node<Integer>head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
}
