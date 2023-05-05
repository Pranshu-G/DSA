package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

    static  List<List<Integer>> ans = new ArrayList<>();
    public static boolean isSafe(int[][] board, int r, int c, int n){
        //verticle
        for(int i=0;i<r;i++){
            if(board[i][c]==1){
                return false;
            }
        }

        // left diagonal
        for(int i=r-1,j=c-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        // right diagonal
        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
   }
    public static List<List<Integer>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        helper(board,0,n);
        return ans;
    }

    public static void helper(int[][] board, int r, int n){
        if(r==n){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]==1){
                        temp.add(j+1);
                    }
                }
            }
            ans.add(temp);
        }

        for(int i=0;i<n;i++){
            if(isSafe(board,r,i,n)){
                board[r][i]=1;
                helper(board,r+1,n);
                board[r][i]=0;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] m = new int[4][4];
//        for(int i=0;i<m.length;i++){
//            for(int j=0;j<m[i].length;j++){
//                System.out.print(m[i][j] + " ");
//            }
//            System.out.println();
//        }
        solveNQueens(4);
        for(List<Integer>l : ans){
            for(int i: l){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
