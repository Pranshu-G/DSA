package Graph;

import LinkedList.DoublyLinkedList;
import LinkedList.DoublyLinkedListTail;

public class Graph {

    int vertices;
    DoublyLinkedListTail<Integer> adjacencyList[];

    public Graph(int vertices){
        this.vertices = vertices;
        adjacencyList = new DoublyLinkedListTail[vertices];

        for(int i=0;i<vertices;i++){
            adjacencyList[i] = new DoublyLinkedListTail<>();
        }
    }

    public void addEdge(int source, int destination){
       //for directed graph
        if(source<vertices && destination<vertices){
            this.adjacencyList[source].insertAtEnd(destination);
        }
//        for undirected graph
//        this.adjacencyList[destination].insertAtEnd(source);
    }

    public void printGraph(){
        System.out.println(">>Adjacency List of Directed Graph<<");
        for(int i=0;i<vertices;i++){
            if(adjacencyList[i]!=null){
                System.out.print("|" + i + "| => ");

                DoublyLinkedListTail<Integer>.Node temp = adjacencyList[i].getHeadNode();
                while (temp!=null){
                    System.out.print("[" + temp.data + "]");
                    temp=temp.next;
                }
                System.out.println("null");
            } else{
                System.out.println("|" + i + "| => "+ "null");
            }
        }
    }

//    int vertices;
//    DoublyLinkedListTail<Integer> adjacencyList[];
//
//    public Graph(int vertices){
//        this.vertices = vertices;
//        adjacencyList = new DoublyLinkedListTail[vertices];
//        for(int i=0;i<vertices;i++){
//            adjacencyList[i] = new DoublyLinkedListTail<>();
//        }
//    }
//    void printGraph(){
//        System.out.println(">>Adjacency list for a directed graph<<");
//        for(int i=0;i<vertices;i++){
//            if(adjacencyList[i]!=null){
//                System.out.print("|" + i + "| => ");
//                DoublyLinkedListTail<Integer>.Node temp = adjacencyList[i].getHeadNode();
//                while(temp!=null){
//                    System.out.print("["+ temp.data + "] -> ");
//                    temp = temp.next;
//                }
//                System.out.println("null");
//            }
//            else{
//                System.out.println("|" + i + "| => " + "null");
//            }
//        }
//
//    }
//
//
//    void addEdge(int source, int destination){
//        if(source<vertices && destination < vertices){
//            this.adjacencyList[source].insertAtEnd(destination);
//        }
//    }

}
