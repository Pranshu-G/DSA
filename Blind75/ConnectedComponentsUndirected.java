package Blind75;

import java.util.Arrays;

public class ConnectedComponentsUndirected {

    public static int componentsCountInGraph(int n, int[][] edges) {
        // Your code will replace the placeholder return statement.
       boolean[] vis = new boolean[n];
       Arrays.fill(vis,false);
       int count = 0;
       for(int i=0;i<edges.length;i++){
           if(!vis[edges[i][0]] && !vis[edges[i][1]]){
               vis[edges[i][0]] = true;
               vis[edges[i][1]] = true;
               n-=2;
               count++;
           }
           else if(!vis[edges[i][0]] || !vis[edges[i][1]]){
               vis[edges[i][0]] = true;
               vis[edges[i][1]] = true;
               n-=1;
           }
       }
       while(n>0){
           n--;
           count++;
       }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,1},{1,2},{3,4}};
        int n =5;
        System.out.println(componentsCountInGraph(n,arr));
    }

}
