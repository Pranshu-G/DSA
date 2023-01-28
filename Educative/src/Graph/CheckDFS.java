package Graph;

import LinkedList.DoublyLinkedListTail;
import java.util.*;

public class CheckDFS {

    public static String DFS(Graph g){
        String result = "";
        boolean visited[] = new boolean[g.vertices];
        for(int i=0;i<g.vertices;i++){
            if(!visited[i]){
                result=result+DFSvisit(g,visited,i);
            }
        }
        return result;
    }

    public static String DFSvisit(Graph g, boolean[] visited, int source){
        String result = "";
        Stack<Integer> s = new Stack<Integer>();
        s.push(source);

        while (!s.isEmpty()){
            int curr_node = s.pop();
            result+=String.valueOf(curr_node);
            DoublyLinkedListTail<Integer>.Node temp = null;
            if(g.adjacencyList[curr_node]!=null){
                temp = g.adjacencyList[curr_node].head;
            }

            while(temp!=null){
                if(!visited[temp.data]){
                    s.push(temp.data);
                }
                temp = temp.next;
            }
            visited[curr_node]=true;
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
        System.out.println("BFS traversal of Graph1 : " + DFS(g));
        System.out.println();

        Graph g2 = new Graph(5);
        g2.addEdge(0,1);
        g2.addEdge(0,4);
        g2.addEdge(1,2);
        g2.addEdge(4,3);
        System.out.println("Graph2:");
        g2.printGraph();
        System.out.println("BFS traversal of Graph2 : " + DFS(g2));
    }
}
