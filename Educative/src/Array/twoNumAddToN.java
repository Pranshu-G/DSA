package Array;

public class twoNumAddToN {

    static int[] findSum(int[] arr, int n){
        //brute force
        int[] result = new int[2];
        for(int i=0;i<arr.length;i++){
            int req = n-arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==req){
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 81;
        int[] result = findSum(arr,value);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
