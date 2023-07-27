package Graph.UnionFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Edge implements Comparable<Edge>{
    int src,dest,wt;
    Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }

    @Override
    public int compareTo(Edge that) {
        return  this.wt-that.wt;
    }
}
public class KruskalMinSpanningTree {

    static int p[],rank[];

    static void union(int x,int y){
        int rx = find(x);
        int ry = find(y);
        if(rx==ry) return;
        p[ry] = rx;
    }

    static int find(int x){
        if(p[x]==x) return x;
        return find(p[x]);
    }
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean added[][] = new boolean[V][V];
        ArrayList<Edge> edge = new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                ArrayList<Integer> cur= adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)] = true;
                    added[cur.get(0)][i]=true;
                    edge.add(new Edge(i,cur.get(0),cur.get(i)));
                }
            }
        }
        p = new int[V];
        for(int i=0;i<V;i++){
            p[i]=i;
        }
        Collections.sort(edge);
        int count =1;
        int ans =0;
        for(int i=0;count<V;i++){
            Edge edge1 = edge.get(i);
            int rx=find(edge1.src);
            int ry = find(edge1.dest);
            if(rx!=ry){
                union(rx,ry);
                count++;
                ans+=edge1.wt;
            }
        }
        return ans;
    }
}
