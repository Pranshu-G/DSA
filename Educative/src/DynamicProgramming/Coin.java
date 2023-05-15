package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class Coin {

    public static void main(String[] args) {
        int n = 18;
        int[] arr={7,5,1};
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int ans = minCoins(n,arr,dp);
        System.out.println(ans);
        for(int i: dp){
            System.out.print(i + " ");
        }

    }

    static int minCoins(int n,int[] arr,int[] dp){
         if(n==0){
             return 0;
         }
         int ans = Integer.MAX_VALUE;


         for(int i: arr){
             if(n-i>=0){
                 int subAns=0;
                 if(dp[n-i]!=-1){
                     subAns = dp[n-i];
                 }
                 else{
                     subAns =minCoins(n-i,arr,dp);
                 }
                 if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                     ans = subAns+1;
                 }
             }
         }
         return dp[n]=ans;
     }
}
