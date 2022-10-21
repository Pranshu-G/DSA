package Queue;

public class QueueLinkedList {
  LinkedList  list;

  public QueueLinkedList(){
      list  = new LinkedList();
      System.out.println("The queue was successfully created");
  }

    public boolean isEmpty(){
        if(list.head==null){
            return true;
        }
        else{
            return false;
        }
  }

    //enQueue
    public void enQueue(int value){
      list.insertInLinkedList(value,list.size);
      System.out.println("Successfully inserted element in Queue ");
  }

    //deQueue
    public int deQueue(){
      int value = -1;
      if(isEmpty()){
          System.out.println("The queue is empty");
      }else{
          value = list.head.value;
          list.deletionOfNode(0);
      }
    return value;
  }

    public int peek(){
      if(isEmpty()){
          System.out.println("The queue is empty");
          return -1;
      }
        else{
            return list.head.value;
        }
  }
    public void delete(){
      list.head = null;
      list.tail = null;
  }
}