package BackTracking;

public class WordSearch {

    public static boolean wordSearch(char[][] grid, String word) {
        // Write your code here
        int index=0;
        int n = grid.length;
        if(n==0){
            return false;
        }
        int m = grid[0].length;
        if(word.length()==0){
            return false;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==grid[i][j]){
                    if(helper(grid,word,i,j,m,n,0));{
                        return true;
                    }
                }

            }
        }
        return  false;
    }

    static boolean helper(char[][] grid, String word, int i, int j,int m,int n, int index){
            if(index>=word.length()){
                return true;
            }
            if(i<0 || i>=n || j<0|| j>=m || grid[i][j]=='.' ){
                return false;
            }
            if(word.length()==1 && word.charAt(index)==grid[i][j]){
                return true;
            }
            if(word.charAt(index)!=grid[i][j]){
                return false;
            }

            boolean temp = false;
            int[] x = {0,0,-1,1};
            int[] y = {-1,1,0,0};
            for(int k=0;k<4;k++){
                temp = temp || helper(grid,word,i+x[k],j+y[k],m,n,index+1);
            }
            grid[i][j] = word.charAt(index);
            return temp;
    }



}
