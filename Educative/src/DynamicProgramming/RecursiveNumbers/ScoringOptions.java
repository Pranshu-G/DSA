package DynamicProgramming.RecursiveNumbers;

import java.util.Arrays;

public class ScoringOptions {
    public static long scoringOptions (int n) {

        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        // Replace this placeholder return statement with your code
        return scoringOptions(n-1) + scoringOptions(n-2) + scoringOptions(n-4);
    }
    public static long scoringOptionsTab (int n){
        long[] lookUp = new long[n+1];
        lookUp[0] =1;
        long s1,s2,s4;
        for(int i=1;i<n+1;i++){
            s1 = i-1<0?0:lookUp[i-1];
            s2 = i-2<0?0:lookUp[i-2];
            s4 = i-4<0?0:lookUp[i-4];
            lookUp[i] = s1 + s2 + s4;
        }
        return lookUp[n];
    }

    public static long scoringOptionsMem (int n){
        long[] lookUp = new long[n+1];
        Arrays.fill(lookUp,-1);
        return helper(n,lookUp);
    }

    static long helper(int n, long[] lookUp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(lookUp[n]!=-1){
            return lookUp[n];
        }
        lookUp[n] = helper(n-1,lookUp) + helper(n-2,lookUp) + helper(n-4, lookUp);
        return lookUp[n];
    }

}
