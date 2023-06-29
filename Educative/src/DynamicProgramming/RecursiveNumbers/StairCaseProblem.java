package DynamicProgramming.RecursiveNumbers;

import java.util.Arrays;

public class StairCaseProblem {

    static long res = 0;
    public static long countWays(int n) {
        //Write your code here
        // your code will replace the placeholder return statement below
        if(n<0){
            return 0;
        }
        if(n==0 || n==1){
            return 1;
        }

        res = countWays(n-1) + countWays(n-2) + countWays(n-3);
        return res;
    }

    public static long countWaysMem(int n,long lookUp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        else if(lookUp[n]>=-1){
            return lookUp[n];
        }
        else{
            lookUp[n] = countWaysMem(n-1,lookUp) + countWaysMem(n-2,lookUp) + countWaysMem(n-3,lookUp);
        }
        return lookUp[n];
    }
    public static long countWays2(int n) {
        long lookupArray[] = new long[n + 1];
        for(int i = 0; i < lookupArray.length; i++) {
            lookupArray[i] = -1;
        }
        return countWaysMem(n, lookupArray);

    }

    public static long countWaysTab(int n){
        long[] lookUp = new long[n+1];
        Arrays.fill(lookUp,0);
        lookUp[0] = 1;
        lookUp[1] = 1;
        lookUp[2] = 2;
        for(int i=3;i<n+1;i++){
            lookUp[i] = lookUp[i-1] + lookUp[i-2] + lookUp[i-3];
        }
        return lookUp[n];
    }


    public static void main(String[] args) {
        System.out.println(countWaysTab(3));
    }

}
