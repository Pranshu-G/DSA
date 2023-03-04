package DynamicProgramming;

import java.math.BigInteger;
import java.util.HashMap;

public class Fibonacci {


    //memoization
    public static int fibMemo(int n, HashMap<Integer,Integer> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n<=2)
            return 1;

        memo.put(n,fibMemo(n-1,memo) + fibMemo(n-2,memo));

        return memo.get(n);
    }

    public static int fibArr(int n,  int[] lookup){
        if(lookup[n] == -1){
            if(n<=1){
                lookup[n] = n;
            }
            else{
                lookup[n] = fibArr(n-1,lookup) + fibArr(n-2,lookup);
            }
        }
        return lookup[n];
    }


    public static int fib(int n){
        if(n<=2){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int ans = fib(7);
        System.out.println(ans);
        int [] lookupTable = new int[9];
        for (int i = 0; i < 9; i++)
            lookupTable[i] = -1; // Initializing the look up table to have -1

        System.out.println(fibArr(8,lookupTable));
    }
}
