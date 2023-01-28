package LinkedList;

public class midOfALL {

    public static Object findMiddle(SinglyLinkedList<Integer> list) {
        // Write -- Your -- Code
        SinglyLinkedList.Node slow = list.head;
        SinglyLinkedList.Node fast = list.head;

        while( fast.next!=null && fast.next.next!=null   ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.printList();
        for(int i=0;i<=10;i++){
            sll.insertAtEnd(i);

        }
        sll.printList();
        Integer result = (Integer)findMiddle(sll);
        System.out.println(result);
    }
}
