package DynamicProgramming.RecursiveNumbers;

import java.util.Arrays;

public class NumberFactors {
    static long res = 0;
    public static long countWays (int n) {

        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        res = countWays(n-1) + countWays(n-3) + countWays(n-4);
        // Replace this placeholder return statement with your code
        return res;
    }
    public static long countWaysNew(int n){
        long[] lookUp = new long[n+1];
        Arrays.fill(lookUp,-1);
        return countWaysMem(n,lookUp);
    }

    public static long countWaysMem(int n, long[] lookUp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(lookUp[n]>1){
            return lookUp[n];
        }

        lookUp[n] = countWaysMem(n-1,lookUp) + countWaysMem(n-3,lookUp) + countWaysMem(n-4,lookUp);
        return lookUp[n];
    }
    public static long CountWaysTab(int n){
        long[] lookUp = new long[n+1];
        Arrays.fill(lookUp,-1);
        lookUp[0] = 1;
        long n1,n3,n4;
        for(int i=1;i<n+1;i++){
            n1=i-1<0?0:lookUp[i-1];
            n3 = i-3<0?0:lookUp[i-3];
            n4 = i-4<0?0:lookUp[i-4];
            lookUp[i] = n1+n3+n4;
        }

        return lookUp[n];
    }

}
