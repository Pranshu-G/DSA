import java.util.Scanner;

public class LinkedListUse {

  public static void print(Node<Integer>head){
      Node<Integer> temp = head;
      while(temp!=null){
          System.out.print(temp.data + " ");
          temp = temp.next;
      }
  }

  public static Node<Integer> takeInput()
  {
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

  public static int length(Node<Integer> head){
      int count = 1;
      if(head==null){
          return 0;
      }
      while(head.next!=null){
          count = count+1;
          head = head.next;
      }
      System.out.println(count);
      return count;

  }

  public static void printIthNode(Node<Integer> head, int i) {
    // Your code goes here
    int count = 0;
    if (head == null) {
      System.out.println();
    } else {
      while (i != count) {
        head = head.next;
        count++;
      }
      System.out.println(head.data);
    }
  }
    public static void main(String[] args) {
    //
//      Node<Integer> node1 = new Node<>(10);
//      Node<Integer> node2 = new Node<>(20);
//      Node<Integer> node3 = new Node<>(30);
//      node1.next = node2;
//      node2.next = node3;
//      Node<Integer> head = node1;
//      Node<Integer> head = takeInput();
//      print(head);

        Node<Integer> one = new Node(10);
        Node<Integer> two = new Node(20);
        one.next = two;
        Node<Integer> head = takeInput();
        printIthNode(head,1);
  }
}
