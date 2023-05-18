package DynamicProgramming.Knapsack01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetSum {

//    static int amount = 0;
//    public static int findTargetSumWays(List<Integer> arr, int T){
//
//        // Write your code here
//        helper(arr,T,0,0);
//        return amount;
//    }
//
//    public static void helper(List<Integer> arr, int T, int curr, int i){
//
//        if(i==arr.size()){
//            if(curr==T){
//                amount++;
//                return;
//            }
//            return;
//        }
//
//        helper(arr,T,curr+arr.get(i),i+1);
//        helper(arr,T,curr-arr.get(i),i+1);
//    }

    static int total;


    public static int findTargetSumWaysRec(List<Integer>nums, int T, int i, int[][] dp,int total,int sum){
            if(i==nums.size()){
                if(sum==T){
                    return 1;
                }
                return 0;
            }

            if(dp[i][total+sum]!=-1){
                return dp[i][total+sum];
            }

            dp[i][sum+total] = findTargetSumWaysRec(nums,T,i+1,dp,total,sum+nums.get(i))
                                    + findTargetSumWaysRec(nums,T,i+1,dp,total,sum-nums.get(i));

            return dp[i][sum+total];
    }

    public static int findTargetSumWaysTab(List<Integer>nums, int T ){
        int total = 0;
        for(int i:nums){
            total+=i;
        }
        int[][] dp = new int[nums.size()][2*total+1];
        for(int[] rows: dp){
            Arrays.fill(rows,0);
        }
        dp[0][total+nums.get(0)] = 1;
        dp[0][total-nums.get(0)] = 1;

        for(int i=1;i<nums.size();i++){
            for(int t=-total;t<total;t++){
                if(dp[i-1][total+t]!=0){
                    dp[i][total+t+nums.get(i)]+=dp[i-1][total+t];
                    dp[i][total+t-nums.get(i)]+=dp[i-1][total+t];
                }
            }


        }
        return dp[nums.size()-1][total + T];
    }

    public static int findTargetSumWays(List<Integer>nums, int T ) {
        int total = 0;
        for(int i:nums){
            total+=i;
        }

        if(total<Math.abs(T)){
            return 0;
        }

        int[][] dp = new int[nums.size()][2*total + 1];
        for(int[] row: dp)
            Arrays.fill(row,-1);

        return findTargetSumWaysRec(nums,T,0,dp,total,0);

    }

    public static int calculate(int[] nums, int i, int sum, int S, int[][] memo) {
        if (i == nums.length) {
            if (sum == S) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (memo[i][sum + total] != Integer.MIN_VALUE) {
                return memo[i][sum + total];
            }
            int add = calculate(nums, i + 1, sum + nums[i], S, memo);
            int subtract = calculate(nums, i + 1, sum - nums[i], S, memo);
            memo[i][sum + total] = add + subtract;
            return memo[i][sum + total];
        }
    }
    public static void main(String[] args) {
//        List<Integer> l = new ArrayList<>(List.of(1, 1, 1, 1));
        List<Integer> arr = List.of(1,2,1);
        int T = 2;
        System.out.println(findTargetSumWays(arr,T));
        System.out.println(findTargetSumWaysTab(arr,T));
    }
}
