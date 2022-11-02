public class DivideLLinTwo {


    public static void make2List(Node<Integer> head) {
        // Write your code here
        Node<Integer> head1 = reverse(head);
        Node<Integer> head2 = head1.next;
        Node<Integer>temp1 = head1;
        Node<Integer> temp2 =head2;

        if(temp2==null){
            System.out.println(temp1 + " ");
            return;
        }
        while(temp1.next!=null && temp2.next!=null){
            temp1.next = temp1.next.next;
            temp2.next = temp2.next.next;
           if(temp1.next!=null){
               temp1 = temp1.next;
           }
            if(temp2.next!=null) {
                temp2 = temp2.next;
            }
        }


         while(head1!=null){
             System.out.print(head1.data + " ");
             head1 = head1.next;
         }

        System.out.println("\n");
         while(head2!=null){
             System.out.print(head2.data + " ");
             head2 = head2.next;
         }

    }

    public static Node reverse(Node<Integer>head){
        Node<Integer> curr = head;
        Node<Integer> prev =null,next=null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node<Integer> one = new Node(10);
        Node<Integer> two = new Node(20);
        one.next = two;
        Node<Integer> three = new Node(30);
        Node<Integer> four = new Node(40);
        two.next = three;
        three.next = four;

        Node<Integer> five = new Node(50);
        Node<Integer> six = new Node(60);
        four.next = five;
        five.next = six;

        Node<Integer> seven = new Node(70);
        Node<Integer> eight = new Node(80);
        six.next = seven;
        seven.next = eight;
        Node<Integer> nine = new Node(90);
        eight.next = nine;
        nine.next = null;

        make2List(one);
    }


}
