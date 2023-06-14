package Graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JInternalFrame;

class Edge implements Comparable<Edge>{

    int src,dest,wt;
    Edge(int src,int dest,int wt){
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
    @Override
    public int compareTo(Edge that) {
        return this.wt-that.wt;
    }
}
public class KruskalMST {

    static int parent[], rank[];
   static int find(int x){
        if(parent[x]==x)
            return x;
        return find(parent[x]);
    }

   static void union(int x, int y){
        int xRoot = find(x), yRoot = find(y);
        if(xRoot==yRoot)
            return;


        if(rank[xRoot]<rank[yRoot])
            parent[xRoot] = yRoot;

        else if(rank[yRoot]<rank[xRoot])
            parent[yRoot] = xRoot;

        else{
            parent[yRoot]=xRoot;
            rank[xRoot] = rank[xRoot] + 1;
        }
    }
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean added[][] = new boolean[V][V];
        ArrayList<Edge>edges = new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                ArrayList<Integer>cur = adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)] = true;
                    added[cur.get(0)][i] = true;
                    edges.add(new Edge(i,cur.get(0),cur.get(1)));
                }
            }
        }
        parent = new int[V];
        for(int i=0;i<V;i++){
            parent[i] = i;
        }
        Collections.sort(edges);
        int count =1;
        int ans =0;
        for(int i =0; count<V;i++){
            Edge edge = edges.get(i);
            int rx = find(edge.src);
            int ry = find(edge.src);
            if(rx!=ry){
                union(rx,ry);
                count++;
                ans+=edge.wt;
            }
        }
        return ans;

    }
}
