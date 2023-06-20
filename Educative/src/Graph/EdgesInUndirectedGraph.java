package Graph;


import LinkedList.DoublyLinkedListTail;
import java.util.HashMap;

class edge{
    int src;
    int dest;

    edge(int src,int dest){
        this.src = src;
        this.dest = dest;
    }

}
public class EdgesInUndirectedGraph {

    static int count = 0;

    static int numEdges(Graph g){
        boolean[] visited = new boolean[g.vertices];
        HashMap<edge,Integer> map = new HashMap<>();
        for(int i=0;i<g.vertices;i++){
            bfsVisit(g,visited,i,map);
        }

        return count;
    }

    static int bfsVisit(Graph g, boolean[] visited,int start,HashMap map){
        Queue<Integer> q = new Queue<Integer>(g.vertices);
        q.enqueue(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int currNode = q.dequeue();
            DoublyLinkedListTail<Integer>.Node temp = null;
            if(g.adjacencyList[currNode].getHeadNode()!=null){
                temp = g.adjacencyList[currNode].getHeadNode();
            }
            while(temp!=null){
                q.enqueue(temp.data);
                edge e = new edge(currNode, temp.data);
                edge rev = new edge(temp.data,currNode);
                if(!map.containsKey(e) && !map.containsKey(rev)){
                    map.put(e,1);
                    count++;
                }
                temp = temp.next;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        System.out.println(numEdges(g));
    }
}
