package Graph;

import LinkedList.DoublyLinkedListTail;
import java.util.*;

//public class CheckDFS {
//
//    public static String DFS(Graph g){
//        String result = "";
//        boolean visited[] = new boolean[g.vertices];
//        for(int i=0;i<g.vertices;i++){
//            if(!visited[i]){
//                result=result+DFSvisit(g,visited,i);
//            }
//        }
//        return result;
//    }
//
////    public static String DFSvisit(Graph g, boolean[] visited, int source){
////        String result = "";
//////        Stack<Integer> s = new Stack<Integer>();
////
////    }
//
//    public static String dfs(Graph g){
//        String result = "";
//        boolean visited[] = new boolean[g.vertices];
//        for(int i=0;i<g.vertices;i++){
//            if(!visited[i]){
//                result=result+dfsVisit(g,visited,i);
//            }
//        }
//        return result;
//    }
//
//
//    public static String dfsVisit(Graph g, boolean[] visited, int source){
//        String result = "";
//        Stack<Integer>st = new Stack<Integer>(g.vertices);
//        visited[source] = true;
//        st.push(source);
//        while(!st.isEmpty()){
//            int currNode = st.pop();
//            result = result + String.valueOf(currNode);
//            DoublyLinkedListTail<Integer>.Node temp = null;
//            if(g.adjacencyList[currNode].getHeadNode()!=null){
//                temp = g.adjacencyList[currNode].getHeadNode();
//            }
//            while(temp!=null){
//                if(!visited[temp.data]){
//                    s.push(temp.data);
//                }
//                temp = temp.next;
//            }
//            visited[currNode]=true;
//        }
//        return result;
//    }
//
//    public static void main(String args[]) {
//        Graph g = new Graph(5);
//        g.addEdge(0,1);
//        g.addEdge(0,2);
//        g.addEdge(1,3);
//        g.addEdge(1,4);
//        System.out.println("Graph1:");
//        g.printGraph();
//        System.out.println("BFS traversal of Graph1 : " + DFS(g));
//        System.out.println();
//
//        Graph g2 = new Graph(5);
//        g2.addEdge(0,1);
//        g2.addEdge(0,4);
//        g2.addEdge(1,2);
//        g2.addEdge(4,3);
//        System.out.println("Graph2:");
//        g2.printGraph();
//        System.out.println("BFS traversal of Graph2 : " + DFS(g2));
//    }
//}
