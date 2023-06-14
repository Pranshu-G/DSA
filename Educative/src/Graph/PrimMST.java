package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }

    @Override
    public int compareTo(Pair that) {
        return this.wt - that.wt;
    }
}

public class PrimMST {

    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean[] vis = new boolean[v];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int ans =0;
        while (pq.size()!=0){
            Pair curr = pq.remove();
            int u = curr.v;
            if(vis[u]){
                continue;
            }
            vis[u] = true;
            ans+= curr.wt;
            ArrayList<ArrayList<Integer>> neighbours = adj.get(u);
            for(ArrayList<Integer> list:neighbours){
                int vertex = list.get(0);
                int wt = list.get(1);
                if(vis[vertex]==false){
                    pq.add(new Pair(vertex,wt));
                }
            }
        }
        return ans;
    }

}
