package TwoPointer;

import java.util.Arrays;

public class SumOfThreeValues {

    public static boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);
        // Write your code here
        for(int i=0;i<nums.length;i++){
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
                if(nums[i]+nums[low]+nums[high]==target){
                    return true;
                }
                else if(nums[i]+nums[low]+nums[high]<target){
                    low++;
                }
                else if(nums[i]+nums[low]+nums[high]>target){
                    high--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target=13;
        boolean result = findSumOfThree(arr,target);
        System.out.println(result);
    }
}
