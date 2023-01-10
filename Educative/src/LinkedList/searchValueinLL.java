package LinkedList;

public class searchValueinLL {
    public static boolean search(SinglyLinkedList.Node head, int num) {
        if(head==null){
            return false;
        }
        if(head.data==(Integer)num){
            return true;
        }
        return search(head.next,num);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        for(int i=0;i<=10;i++){
            sll.insertAtEnd(i);

        }
        sll.printList();
       boolean ans= search(sll.head,12);
        System.out.println(ans);
    }
}
