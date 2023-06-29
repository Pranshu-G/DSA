package DynamicProgramming.RecursiveNumbers;

public class findUniquePath {
    public static int findUniquePath(int[][] matrix) {
        // write your code here
        int i=0,j=0,rows = matrix.length, cols = matrix[0].length;
        return helper(matrix,i,j,rows,cols);
        // your code will replace the placeholder return statement below

    }

    public static int helper(int[][] matrix, int i, int j, int rows, int cols){
        if(i==rows-1 && j == cols-1){
            return 1;
        }
        if(matrix[i][j]==1){
            return 0;
        }
        if(i== rows || j == cols){
            return 0;
        }

        return helper(matrix,i+1,j,rows,cols) + helper(matrix,i,j+1,rows,cols);
    }
}
