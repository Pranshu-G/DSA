package Array;

public class minimumValueOfArray {



    public static int findMinimum(int[] arr) {
        // Write your code here
        int min = Integer.MAX_VALUE;

        for(int i: arr){
            if(i<min){
                min = i;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int result = findMinimum(arr);
        System.out.println(result);
    }
}
