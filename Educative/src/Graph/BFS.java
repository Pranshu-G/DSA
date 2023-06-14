package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest,int v,int[] pred,int[] dist){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++){
            vis[i]=false;
            dist[i] = Integer.MAX_VALUE;
            pred[i]= -1;
        }

        vis[src] = true;
        dist[src] = 0;
        queue.add(src);

        while(!queue.isEmpty()){
            int curr = queue.remove();
            for(int i=0;i<adj.get(curr).get(i);i++){
                int neighbour = adj.get(curr).get(i);
                if(vis[neighbour]==false){
                    vis[neighbour] = true;
                    dist[neighbour] = dist[curr] + 1;
                    pred[neighbour] = curr;
                    queue.add(neighbour);
                    if(neighbour==dest){
                        return true;
                    }
                }
            }
        }
        // to count the number of components for disconnected graph
        int component = 0;
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                component++;
                bfs(adj, src, dest, v, pred, dist);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=6;
        int e = 8;
        int[] pred = new int[v+1];
        int[] dist = new int[v+1];
        boolean isReached = bfs(adj,1,6,v,pred,dist);



    }
}
