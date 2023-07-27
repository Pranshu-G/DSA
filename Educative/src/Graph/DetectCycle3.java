package Graph;

import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DetectCycle3 {

    public static boolean detectCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[v]){
                if(dfs(i,adj,vis,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent){
        vis[v] = true;
        for(Integer neighbour: adj.get(v)){
            if(!vis[neighbour]){
                if(dfs(neighbour,adj,vis,v))
                    return true;
            }
            else if(parent!=neighbour){
                return true;
            }
        }
        return false;
    }

    public static boolean detectCycleDirected(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        boolean[] recS = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(dfsDirected(i,adj,vis,recS)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfsDirected(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] recS){
        vis[v] = true;
        recS[v] = true;
        for(Integer neighbour: adj.get(v)){
            if(!vis[neighbour]){
                if(dfsDirected(neighbour,adj,vis,recS)){
                    return true;
                }
            }
            else if(recS[neighbour]){
                return true;
            }
        }
        recS[v] = false;
        return false;
    }
}
