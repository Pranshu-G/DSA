package Graph;

import LinkedList.DoublyLinkedListTail;
import Stack.Stack;

public class DetectCycle {

    public static boolean detectCycle(Graph g){
        // Write -- Your -- Code
        boolean visited[] = new boolean[g.vertices];
        boolean stackFlag[] = new boolean[g.vertices];

        for(int i=0;i<g.vertices;i++){
            if(!visited[i]){
                return detectCycleVisit(g,i,visited,stackFlag);
            }
        }
        return false;
    }

    public static boolean detectCycleVisit(Graph g, int v, boolean[] visited,boolean[] stackFlag){
        if(stackFlag[v]){
            return true;
        }

        if(visited[v]){
            return false;
        }

        visited[v] = true;
        stackFlag[v] = true;

        DoublyLinkedListTail<Integer>.Node temp = null;
        if(g.adjacencyList[v].head!=null){
            temp=g.adjacencyList[v].getHeadNode();
        }

        while(temp!=null){
            if(detectCycleVisit(g,temp.data,visited,stackFlag)){
                return true;
            }
            temp = temp.next;
        }
        stackFlag[v] =false;
        return false;
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        boolean cycle = detectCycle(g);
        System.out.println(cycle);
    }
}
