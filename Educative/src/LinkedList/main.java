package LinkedList;

public class main {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.printList();
        for(int i=0;i<=10;i++){
            sll.insertAtEnd(i);

        }
        sll.printList();
        sll.insertAtEnd(11);
        sll.deleteByValue(10);
        sll.printList();


//        DLLwithTail<Integer> list = new DLLwithTail<>();
//        for(int i=0;i<10;i++){
//            dll.insertAtHead(i);
//        }
//        dll.printList();
//        dll.deleteByValue(4);
//        dll.printList();
//        for (int i = 0; i <= 3; i++) {
//            list.insertAtHead(i); //inserting 0 to 3 at start
//        }
//        System.out.println("After inserting 0 to 3 at start :");
//        list.printList();
//        for (int i = 5; i <= 10; i++) {
//            list.insertAtEnd(i); //inserting 5 to 10 at end
//        }
//        System.out.println("\n After inserting 5 to 10 at end :");
//        list.printList();
    }
}
