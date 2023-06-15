package BackTracking;

public class NQueen2 {

    static int count = 0;
    public static int solveNQueens(int n) {

        // Write your code here
        int[][] board = new int[n][n];
        helper(board,0,n);

        return count;
    }

    public static void helper(int[][] board, int r, int n){
        if(r==n){
            count++;
        }

        for(int i=0;i<n;i++){
            if(isSafe(board,r,i,n)){
                board[r][i] = 1;
                helper(board,r+1,n);
                board[r][i]=0;
            }
        }
    }

    public static boolean isSafe(int[][] board, int r, int c, int n){

        // check vertical
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

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

}
