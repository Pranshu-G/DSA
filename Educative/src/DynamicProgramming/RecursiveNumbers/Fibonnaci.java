package DynamicProgramming.RecursiveNumbers;

import java.util.Arrays;

public class Fibonnaci {

    static long getFibonacci(int n){
        long[] lookUp = new long[n+1];
        Arrays.fill(lookUp,-1);
        return getFibMem(n,lookUp);
    }

    static long getFibMem(int n,long[] lookUp){
        if(n<2){
            return n;
        }
        if(lookUp[n]!=-1){
            return lookUp[n];
        }
        lookUp[n] = getFibMem(n-1,lookUp) + getFibMem(n-2,lookUp);
        return lookUp[n];
    }

}
