package Array;

public class findMaxSumSubarray {

    public static int findMaxSumSubArray(int[] arr) {
        // Write - Your - Code
//        int sum=Integer.MIN_VALUE;
//       for(int i=0;i<arr.length;i++){
//
//           int currSum=arr[i];
//
//           for(int j=i+1;j<arr.length;j++){
//               currSum=currSum+arr[j];
//               if(currSum>sum){
//                   sum=currSum;
//               }
//           }
//       }
//       return sum;

        int currMax = arr[0];
        int globalMax= arr[0];

        for(int i=0;i<arr.length;i++){
            if(currMax<0){
                currMax=arr[i];
            }
            else{
                currMax+=currMax+arr[i];
            }
            if(currMax>globalMax){
                globalMax=currMax;
            }
        }
        return globalMax;
    }
    public static int findMaxSumSubArrayBrute(int[] arr) {
        // Write - Your - Code
        int sum=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           int currSum=0;

           for(int j=i+1;j<arr.length;j++){
               currSum=currSum+arr[j];
               if(currSum>sum){
                   sum=currSum;
               }
           }
       }
       return sum;
    }
    public static void main(String[] args) {
        int[] arr = {-5, -13, -2, -4};
        int result =findMaxSumSubArrayBrute(arr);
        System.out.println(result);
        }

}
