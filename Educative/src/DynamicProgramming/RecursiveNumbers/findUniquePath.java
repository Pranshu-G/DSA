package DynamicProgramming.RecursiveNumbers;

import java.util.Arrays;

public class findUniquePath {
    public static int findUniquePath(int[][] matrix) {
        // write your code here
        int i=0,j=0,rows = matrix.length, cols = matrix[0].length;
        return helper(matrix,i,j,rows,cols);
        // your code will replace the placeholder return statement below

    }
    public static int findUniquePathTab(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        if(matrix[0][0]==1){
            return 0;
        }
        matrix[0][0] =1;
        for(int i=0;i<row;i++) {
            if (matrix[i][0] == 0 && matrix[i - 1][0] == 1) {
                matrix[i][0] = 1;
            } else {
                matrix[i][0] = 0;
            }
        }
            for(int j=0;j<col;j++){
                if(matrix[0][j]==0 && matrix[0][j-1]==1){
                    matrix[0][j] = 1;
                }
                else{
                    matrix[0][j] = 0;
                }
            }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]!=1){
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix[row-1][col-1];
    }
    public static int findUniquePath3(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // If the starting cell has an obstacle, then return 0
        // as there would be no paths to the destination.
        if (matrix[0][0] == 1) {
            return 0;
        }

        // Number of ways of reaching the starting cell = 1.
        matrix[0][0] = 1;

        // Filling the values for the first column
        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0 && matrix[i - 1][0] == 1) {
                matrix[i][0] = 1;
            } else {
                matrix[i][0] = 0;
            }
        }

        // Filling the values for the first row
        for (int j = 1; j < cols; j++) {
            if (matrix[0][j] == 0 && matrix[0][j - 1] == 1) {
                matrix[0][j] = 1;
            } else {
                matrix[0][j] = 0;
            }
        }

        // Starting from matrix[1][1], we fill up the values.
        // The number of ways of reaching matrix[i][j] = matrix[i - 1][j] + obstacleGrid[i][j - 1]
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        // Return value stored in rightmost bottommost cell.
        // That is the destination.
        return matrix[rows - 1][cols - 1];
    }

    public static int helper(int[][] matrix, int i, int j, int rows, int cols){
        if(i== rows || j == cols){
            return 0;
        }
        if(i==rows-1 && j == cols-1){
            return 1;
        }
        if(matrix[i][j]==1){
            return 0;
        }
        return helper(matrix,i+1,j,rows,cols) + helper(matrix,i,j+1,rows,cols);
    }
    public static int findUniquePath1(int[][] matrix){
        int i=0,j=0,rows=matrix.length,cols=matrix[0].length;
        int[][] path = new int[rows][cols];
        for(int[] row: path){
            Arrays.fill(row,-1);
        }
        return helper1(matrix,path,i,j,rows,cols);
    }

    public static int helper1(int[][] matrix,int[][] path, int i, int j, int rows,int cols){
        if(i==rows || j==cols){
            return 0;
        }
        if(i==rows-1 && j==cols-1){
            return 1;
        }
        if(matrix[i][j]==1){
            return 0;
        }
        if(path[i][j]!=-1){
            return path[i][j];
        }
        path[i][j] = helper1(matrix,path,i+1,j,rows,cols) + helper1(matrix,path,i,j+1,rows,cols);
        return path[i][j];
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1},{0,0}};
        System.out.println(findUniquePath(matrix));
    }
}
