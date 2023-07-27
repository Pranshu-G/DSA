package DynamicProgramming.RecursiveNumbers;

import java.util.Arrays;

public class NthTribonacci {

    public static long tribonacci(int n) {
        // Write your code here
        if(n==0 || n==1){
            return n;
        }
        if(n==2){
            return 1;
        }

        return tribonacci(n-1)+tribonacci(n-2) + tribonacci(n-3);
    }

    public static long tribonacciMemo(int n) {
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
       if(n>0){
           dp[1] = 1;
        }
       if(n>1){
           dp[2]=1;
       }

        return memo(n,dp);
        // Write your code here

    }

    static long memo(int n, long[] dp){
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = memo(n-1,dp) + memo(n-2,dp) + memo(n-3,dp);
        return dp[n];
    }

    static long tab(int n){
        if(n==0){
            return n;
        }
        if(n==1 || n==2){
            return 1;
        }

        long[] dp = new long[n+1];
        Arrays.fill(dp,0);
        dp[0] =0; dp[1] = 1; dp[2] =1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }


}
