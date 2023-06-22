package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class topologicalSort {

        static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj){
            boolean vis[] = new boolean[v];
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i<v;i++){
                if(!vis[i]){
                    dfs(adj,i,stack,vis);
                }
            }
            int ans[] = new int[v];
            int i =0;
            while(!stack.isEmpty()){
                ans[i++] = stack.pop();
            }

            return ans;
        }


        static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> stack, boolean[] vis){
            vis[v] = true;
            for(int neighbour:adj.get(v)){
                if(!vis[neighbour]){
                    dfs(adj,neighbour,stack,vis);
                }
            }
            stack.push(v);
        }

        static int[] topSortBFS(int v, ArrayList<ArrayList<Integer>> adj){
            int[] inDeg = new int[v];
            for(ArrayList<Integer> list:adj){
                for(int e:list){
                    inDeg[e]++;
                }
            }

            boolean[] vis = new boolean[v];
            ArrayList<Integer> ansList = new ArrayList<>();

            bfs(adj,v,0,vis,ansList,inDeg);
            int ans[] = new int[v];
            int i=0;
            for(int e:ansList){
                ans[i++] = e;
            }
            return ans;
        }


    static void bfs(ArrayList<ArrayList<Integer>> adj, int V , int v, boolean[] vis,ArrayList<Integer> ans, int[] inDeg){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }

    while(!q.isEmpty()){
        int curr = q.poll();
        ans.add(curr);
        for(int neighbour: adj.get(curr)){
            if(--inDeg[neighbour]==0){
                q.add(neighbour);
            }
        }
    }
        }

}
