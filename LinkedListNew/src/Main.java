
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);

        sLL.insertSinglyLinkedList(10,0);
        sLL.insertSinglyLinkedList(6,1);
        sLL.insertSinglyLinkedList(7,2);
        sLL.insertSinglyLinkedList(60,3);
        sLL.traverseSinglyLinkedList();
        sLL.deleteLinkedList();
        sLL.traverseSinglyLinkedList();
//        System.out.println(sLL.head.value);
//        System.out.println(sLL.head.next.value);
//        System.out.println(sLL.head.next.next.value);

    }
}