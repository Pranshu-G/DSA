package GreedyTechnique;

public class JumpGame {

    public static boolean jumpGame(int[] nums) {

        return helper(nums,0);
        // Your code will replace the placeholder return statement.

    }

    public static boolean helper(int[] nums, int i){
        if(i==nums.length-1){
            return true;
        }

        for(int j=nums[i];j>0;j--){
            if(i+j<nums.length && helper(nums,i+j))
                return true;
        }

        return false;
    }

    public static boolean jumpGame1(int[] nums) {

        int target = nums.length -1;
        for(int i = target-1; i>=0;i--){
            if(i+nums[i]>=target){
               target = i;
            }
        }
        if(target==0){
            return true;
        }

        return false;
        
        // Your code will replace the placeholder return statement.

    }


    public static void main(String[] args) {
        int[] arr1 = {2,3,1,1,4};
        int[] arr2 =  {3,2,1,0,4};
        System.out.println(jumpGame(arr1));
        System.out.println(jumpGame(arr2));
    }

}
