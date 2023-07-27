package Graph.UnionFind;

import java.util.HashSet;

class UnionFind {

    public int[] parent;

    // Constructor
    public UnionFind(int n) {

        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
    }

    // Function to find which subset a particular element belongs to
    public int find(int v) {
        if (parent[v] != v) {
            return find(parent[v]);
        }
        return v;
    }

    // Function to join two subsets into a single subset
    public boolean union(int v1, int v2) {

        int p1 = find(v1);
        int p2 = find(v2);

        if (p1 == p2) {
            return false;
        }
//        else{
//            pare
//        }
//    }
        return false;
}

public class RedundantConnections {

    public static int[] redundantConnection(int[][] edges) {
        UnionFind u = new UnionFind(edges.length);
        HashSet<Integer> set = new HashSet<>();
        for (int[] edge : edges) {
            int p1 = u.find(edge[0]);
            int p2 = u.find(edge[1]);
            if (p1 != p2) {
                u.union(p1, p2);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] edge = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        System.out.println(redundantConnection(edge));
    }


}}
