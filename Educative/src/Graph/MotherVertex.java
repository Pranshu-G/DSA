package Graph;

import LinkedList.DoublyLinkedListTail;
import java.util.Arrays;
import java.util.Stack;

public class MotherVertex {

    public static int findMotherVertex(Graph g){
        // Write - Your - Code
        boolean visited[] = new boolean[g.vertices];
        for(int i=0;i<g.vertices;i++){
            int ans = dfsVisit(g,visited,i);
            if(ans!=-1){
                return ans;
            }
            Arrays.fill(visited, false);
        }
        return -1;
    }

    public static int dfsVisit(Graph g, boolean[] visited, int src){
        visited[src] = true;
        Stack<Integer> st = new Stack<>();
        st.push(src);
        boolean flag = false;
        while(!st.isEmpty()){
            int currNode = st.pop();
            DoublyLinkedListTail<Integer>.Node temp= null;
            if(g.adjacencyList[currNode].getHeadNode()!=null){
                temp = g.adjacencyList[currNode].getHeadNode();
            }
            while (temp!=null){
                if(!visited[temp.data]){
                    st.push(temp.data);
                    visited[currNode] = true;
                }
                temp = temp.next;
            }

        }
        for(boolean k: visited){
            if(k==false){
                flag = false;
                break;
            }
            else{
                flag = true;
            }
        }
        if(flag==true){
            return src;
        }
        else{
            return -1;
        }

    }


    public static void main(String[] args) {
        System.out.println("yada");
        
    }

}
