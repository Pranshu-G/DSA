package Graph;

import java.util.ArrayList;

public class DetectCycle2 {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,-1))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj,boolean[] vis, int parent){
        vis[v] = true;
        for(Integer neighbour: adj.get(v)){
                if(!vis[neighbour]){
                    if(dfs(neighbour,adj,vis,v)){
                        return true;
                    } else if (parent!=neighbour) {
                        return true;
                    }
                }
        }
        return false; 
    }
}
