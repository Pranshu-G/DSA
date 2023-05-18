package DynamicProgramming.Knapsack01;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumCount {

    private static int res =0;
    public static long countSubsetSum(List<Integer> nums, int target) {

        // Replace this placeholder return statement with your code
        helper(nums,target,0,0);
        return res;
    }

    public static void helper(List<Integer> nums, int target, int i, int currSum){
        if(currSum==target){
            res+=1;
            return;
        }
        if(i>=nums.size()){
            return;
        }
        helper(nums,target,i+1,currSum+nums.get(i));
        helper(nums,target,i+1,currSum);
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4));
        int target = 4;
        System.out.println(countSubsetSum(nums,4));

    }
}
