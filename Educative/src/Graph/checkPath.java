package Graph;

import LinkedList.DoublyLinkedListTail;

public class checkPath {

    public static boolean checkPath(Graph g, int source, int destination) {
        // Write - Your - Code

        // perform DFS from source to destination
        boolean flag = false;
        boolean[] visited = new boolean[g.vertices];
        Stack<Integer> st = new Stack<Integer>(g.vertices);
        st.push(source);
        visited[source] = true;
        while(!st.isEmpty()){
            int currNode = st.pop();
            DoublyLinkedListTail<Integer>.Node temp = null;
            if(g.adjacencyList[currNode].getHeadNode()!=null){
                temp = g.adjacencyList[currNode].getHeadNode();
            }
            while(temp!=null){
                if(!visited[temp.data]){
                    st.push(temp.data);
                }
                temp = temp.next;
            }
            visited[currNode] = true;
            if(visited[destination]==true){
                flag = true;
            }
            else{
                continue;
            }
        }
        return flag;
    }

}
