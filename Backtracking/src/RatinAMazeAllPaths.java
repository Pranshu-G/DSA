public class RatinAMazeAllPaths {
    public static void main(String[] args) {
        // Dummy maze matrix
        int maze[][] = {{1,1,0},{1,1,0},{1,1,1}};

        ratInaMaze(maze);

    }

    public static void ratInaMaze(int maze[][]){

        int n = maze.length;
        int path[][] = new int[n][n];
        printAllPaths(maze, 0 ,0,path);

    }

    public static void printAllPaths(int maze[][], int i, int j, int path[][]){
        int n = maze.length;
        //Step 1: Check if the current cell is valid
        if(i<0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j]==1){
            return;
        }
        // Step 2: Add the current cell to path matrix
        path[i][j] =1;
        // Step 3: Check if the cell is destination cell
        if(i == n-1 && j == n-1){
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    System.out.print(path[r][c] + " ");
                }
            System.out.println();
            }
      System.out.println();
            path[i][j] =0;
            return;
        }
        // Step 4: Explore further
        // a. Top
        printAllPaths(maze,i-1,j, path);
        // b. Right
        printAllPaths(maze,i, j+1, path);
        // c. Bottom
        printAllPaths(maze,i+1, j, path);
        // d. Left
        printAllPaths(maze,i, j-1, path);
        path[i][j] =0;
        }
    }


//    public static boolean solveMaze(int maze[][], int i, int j, int path[][]){
//
//        int n = maze.length;
//        //Step 1: Check if the current cell is valid
//        if(i<0 || i > n-1 || j < 0 || j > n-1 || maze[i][j] == 0 || path[i][j]==1){
//            return false;
//        }
//        // Step 2: Add the current cell to path matrix
//        path[i][j] =1;
//        // Step 3: Check if the cell is destination cell
//        if(i == n-1 && j == n-1){
//            for(i=0;i<n;i++){
//                for(j=0;j<n;j++){
//
//                    System.out.print(path[i][j] + " ");
//
//                }
//                System.out.println();
//            }
//            return true;
//        }
//        // Step 4: Explore further
//        // a. Top
//        if(solveMaze(maze,i-1,j, path)){
//            System.out.println(i-1);
//            return true;
//        }
//        // b. Right
//        if(solveMaze(maze,i, j+1, path)){
//            return true;
//        }
//        // c. Bottom
//        if(solveMaze(maze,i+1, j, path)){
//            return true;
//        }
//        // d. Left
//        if(solveMaze(maze,i, j-1, path)){
//            return true;
//        }
//        // Else return false
//        return false;
//    }