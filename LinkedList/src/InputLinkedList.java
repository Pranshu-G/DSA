import java.util.Scanner;

public class InputLinkedList {
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
    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
        Node<Integer> newNode = new Node<Integer>(data);
        if(pos==0){
            newNode.next =head;
            head = newNode;
            return newNode;
        }
        int i = 0;
        Node<Integer> temp = head;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }


        newNode.next = temp.next;
        temp.next = newNode;
        return head;

    }

    public static Node<Integer> insertRecursive(Node<Integer> head, int pos, int elem){

        if(pos == 0){
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            return newNode;
        }
        if(head==null){
            return head;
        } 
       head.next = insertRecursive(head.next, pos-1,elem);

        return head;
    }
    public static void print(Node<Integer>head){


        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args){
        Node<Integer> head = takeInput();
        head = insertRecursive(head, 2, 0);
        print(head);
    }


}
