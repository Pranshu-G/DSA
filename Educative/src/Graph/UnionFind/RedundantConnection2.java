package Graph.UnionFind;

import java.util.ArrayList;
import java.util.Arrays;

class UnionFind{
       int[] parent;
       int[] rank;

       UnionFind(int n){
           parent= new int[n+1];
           rank = new int[n+1];
           for(int i=0;i<=n;i++){
               parent[i] =i;
           }
       }

       int find(int x){
           if(parent[x]!=x){
               parent[x] = find(parent[x]);
           }
           return parent[x];
       }

       void union(int x, int y){
           int xRoot = find(x), yRoot = find(y);

           if(rank[xRoot]>rank[yRoot]){
               parent[yRoot] = xRoot;
           }
           else if(rank[yRoot]>rank[xRoot]){
               parent[xRoot] = yRoot;
           }
           else{
               parent[yRoot] = xRoot;
               rank[xRoot]++;
           }
       }
}
public class RedundantConnection2 {

    static UnionFind uf;
    public static int[] redundantConnection(int[][] edges) {
        int n = edges.length;
        uf = new UnionFind(n);
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            if(uf.find(x)!= uf.find(y)){
                uf.union(x,y);
            }
            else{
                ans.add(new int[]{x,y});
            }
        }

        // Replace this placeholder return statement with your code

        return ans.get(ans.size()-1);
    }
}
