import java.util.Scanner;

public class swapNodes {

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        //Your code goes here

        Node<Integer> temp = head, temp1= head;
        Node<Integer> INode,JNode,temp3;
        int k = 0, l =0;
        if(i==0){
            for(l=0; l < j-1; l++){
                temp1 = temp1.next;
            }
            JNode = temp1.next;
            temp1.next = head;
            head.next = JNode.next;
            JNode.next = temp1;

            return JNode;
        }

        for(k = 0; k<i-1;k++){
            temp = temp.next;
        }

        for(l=0; l < j-1; l++){
            temp1 = temp1.next;
        }

        // swap
        INode = temp.next;
        temp.next = temp1.next;
        JNode = temp1.next;
        temp1.next = INode;
        temp3 = INode.next;
        INode.next = JNode.next;
        JNode.next = temp3;

        return head;
    }

    public static void print(Node<Integer>head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
      print(head);
      Node<Integer> newNode =swapNodes(head,0,2);
        System.out.println();
      print(newNode);


    }
}
