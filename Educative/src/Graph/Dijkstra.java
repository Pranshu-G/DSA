package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//also uses pair class
public class Dijkstra {

    static int[ ] Dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        boolean[] vis = new boolean[v];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(S,0));
        int[] ans = new int[v];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[S] = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int u = curr.v;
            if(vis[u]){
                continue;
            }
            vis[u] = true;
            ArrayList<ArrayList<Integer>> neighbours = adj.get(u);
            for(ArrayList<Integer> list: neighbours){
                int vertex = list.get(0);
                int wt = list.get(1);
                if(ans[vertex]>ans[u] + wt){
                    ans[vertex] = ans[u] + wt;
                    pq.add(new Pair(vertex,ans[vertex]));
                }
            }
        }
        return ans;
    }

}
