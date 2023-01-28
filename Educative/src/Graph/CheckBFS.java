package Graph;

import Queue.Queue;
import LinkedList.DoublyLinkedListTail;

import java.util.LinkedList;

public class CheckBFS {

    public static String bfs(Graph g) {
        String result = "";
        boolean visited[] = new boolean[g.vertices];

        for(int i=0;i<g.vertices;i++){
            if(!visited[i]){
                result = result + bfsVisit(g,visited,i);
            }
        }


        return result;
    }


    public static String bfsVisit(Graph g, boolean[] visited, int source){
        String result = "";
        Queue<Integer> q = new Queue<Integer>(g.vertices);
        q.enqueue(source);
        visited[source]= true;

        while(!q.isEmpty()){
            int curr_node = q.dequeue();
            result+=String.valueOf(curr_node);
            DoublyLinkedListTail<Integer>.Node temp = null;
            if(g.adjacencyList[curr_node].getHeadNode()!=null){
                temp = g.adjacencyList[curr_node].getHeadNode();
            }
            while(temp!=null){
                q.enqueue(temp.data);
                visited[temp.data] = true;
                temp=temp.next;
            }

        }
        return result;
    }



    public static void main(String args[]) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        System.out.println("Graph1:");
        g.printGraph();
        System.out.println("BFS traversal of Graph1 : " + bfs(g));
        System.out.println();

        Graph g2 = new Graph(5);
        g2.addEdge(0,1);
        g2.addEdge(0,4);
        g2.addEdge(1,2);
        g2.addEdge(3,4);
        System.out.println("Graph2:");
        g2.printGraph();
        System.out.println("BFS traversal of Graph2 : " + bfs(g2));
    }
}
