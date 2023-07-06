package Blind75;

import java.util.Arrays;

public class ClimbingStairs{
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return climbStairsMem(n,dp);
    }

    public int climbStairsMem(int n, int[] dp){
        if(n<=0){
            return 0;
        }
        if(n==1 || n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = climbStairsMem(n-1,dp) + climbStairsMem(n-2,dp);
        return dp[n];
    }

    public int climbingStairsTab(int n){
        if(n<=0){
            return 0;
        }
        if(n==1 || n==2){
            return n;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<n+1;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}