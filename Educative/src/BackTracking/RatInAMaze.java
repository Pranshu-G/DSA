package BackTracking;

import java.util.ArrayList;

public class RatInAMaze {

    static ArrayList<String> ans = new ArrayList<>();


    public static boolean isSafe(int[][] m, int[][] visited, int n, int x , int y){
        if(x>=0 && y>=0 && x<n && y<n && visited[x][y]!=1 && m[x][y]==1){
            return true;
        }
        return false;
    }

    public static void helper(int[][]m, int[][] visited,int n, int x, int y, String temp){
        // base condition
        if(x==n-1 && y==n-1){
            ans.add(temp);
            return;
        }

        // mark visited =1
        visited[x][y]=1;

        //down
        if(isSafe(m,visited,n,x+1,y)){
            helper(m,visited,n,x+1,y,temp+"D");
        }
        if(isSafe(m,visited,n,x,y-1)){
            helper(m,visited,n,x,y-1,temp+"L");
        }
        if(isSafe(m,visited,n,x,y+1)){
            helper(m,visited,n,x,y+1,temp+"R");
        }
        if(isSafe(m,visited,n,x-1,y)){
            helper(m,visited,n,x-1,y,temp+"U");
        }

        visited[x][y]=0;


    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        if(m[0][0]==0) return ans;
        int[][] visited = new int[n][n];
        helper(m,visited,n,0,0,"");
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        findPath(arr,4);
        for(String s:ans){
            System.out.println(s);
        }
    }
}
