package DynamicProgramming.Knapsack01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {
    public static boolean subsetSum (List<Integer> arr, int total) {

        // write your code here

        return helper(arr,total,0,0);
    }

    public static boolean subsetSumTab (List<Integer> arr, int total){
        int n = arr.size();
        boolean[][] dp = new boolean[n+1][total+1];

        for(int i = 0; i < n+1; i++)
            for(int j = 0; j < total+1; j++)
                dp[i][j] = false;
        for(int k=0;k<n;k++){
            for(int l=0;l<total;l++){
                if(k==0){
                    dp[k][l]=false;
                }
                if(l==0){
                    dp[k][l]=true;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=0;j<total+1;j++){
                if(arr.get(i-1)>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j-arr.get(i-1)];
                }
            }
        }
        return dp[n][total];
    }
    public static boolean subsetSumMemo (List<Integer> arr, int total) {

        // write your code here
        int n = arr.size();
        int[][] dp = new int[n+1][total+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helperMemo(arr,total,n,dp)==1;
    }

    public static int helperMemo(List<Integer> arr, int total , int n , int[][] dp ){

        if(total==0){
            return 1;
        }

        if(n==0){
            return 0;
        }

        if(dp[n][total]!=-1){
            return dp[n][total];
        }

        if(arr.get(n-1)>total){
            dp[n][total] = helperMemo(arr,total,n-1,dp);
            return dp[n][total];
        }

        dp[n][total]  = helperMemo(arr,total,n-1,dp) | helperMemo(arr, total-(arr.get(n-1)),n-1,  dp);
        return dp[n][total];


    }
    public static boolean helper(List<Integer> arr, int total, int i , int currSum){
        if(currSum==total){
            return true;
        }

        if(i>=arr.size()){
            return false;
        }

        boolean recur1 = helper(arr,total,i+1,currSum+ arr.get(i));
        boolean recur2 = helper(arr,total,i+1,currSum);
        return recur1 || recur2;
    }

    public static void main(String[] args) {
        List<Integer> arr =new ArrayList<>(List.of(1,2,3,7));
        subsetSumMemo(arr,6);
    }
}
