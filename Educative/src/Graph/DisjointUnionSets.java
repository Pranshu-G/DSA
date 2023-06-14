package Graph;

public class DisjointUnionSets {

    int[] rank, parent;
    int n;

    public DisjointUnionSets(int n){
        rank = new int[n];
        parent = new int[n];
        this.n=n;
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
    }

    int find1(int x){
        // using path compression
        if(parent[x]!=x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    int find(int x){
        if(parent[x]==x)
            return x;
        return find(parent[x]);
    }

    void union(int x, int y){
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
}
