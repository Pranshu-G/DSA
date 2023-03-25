package SlidingWindow;

public class MinSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] arr) {
        // your code will replace this placeholder return statement

        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>=target && j-i<=min){
                    min=j-i+1;
                    break;
                }
            }
        }
        return min;
    }

    public static int minSubArrayLenOpt(int target, int[] arr){
        int i=0,j=0;
        int min = Integer.MAX_VALUE;
        int sum=0;
        while(i<arr.length){
            sum=sum+arr[i];
            if(sum>=target && i-j+1<min){
                min=i-j+1;
            }
            while(sum>target){
                sum=sum-arr[j];
                if(sum<target){
                    sum=sum+arr[j];
                    break;
                }
                j++;
            }
            i++;
        }
        if(sum>=target && i-j<min){
            min=i-j;
        }
        if(min==Integer.MAX_VALUE){
            min=0;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3};
        int target = 5;
        System.out.println(minSubArrayLen(target,arr));
        System.out.println(minSubArrayLenOpt(target,arr));
    }



}
