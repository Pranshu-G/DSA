package BitManipulation;

public class flipAndInvertImage {

    public static int[][] flipAndInvertImage(int[][] image) {

        // Your code will replace this placeholder return statement
        for(int k=0;k<image.length;k++){
            int i=0,j=image[k].length-1;
            while(i<j){
                image[k][i]= image[k][i]^image[k][j];
                image[k][j]= image[k][i]^image[k][j];
                image[k][i]= image[k][i]^image[k][j];
                i++;
                j--;
            }

            for(int l=0;l<image[k].length;l++){
                image[k][l]=image[k][l]^1;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{{1,1,0},{0,1,0},{1,0,1}};
        int[][] res = flipAndInvertImage(test);
        for(int i=0;i< res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(test.length);
    }
}
