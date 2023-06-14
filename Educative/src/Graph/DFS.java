package Graph;

import java.util.ArrayList;

public class DFS {

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,adj,vis,ans);
            }
        }
        return ans;
    }

    public void dfs(int V,ArrayList<ArrayList<Integer>> adj,boolean[] vis, ArrayList<Integer> ans){
        vis[V] = true;
        ans.add(V);
        for(Integer neighbour:adj.get(V)){
            if(!vis[neighbour]){
                dfs(neighbour,adj,vis,ans);
            }
        }
    }



}
