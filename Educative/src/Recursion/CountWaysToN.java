package Recursion;

public class CountWaysToN {

    int countWays(int n){
        if (n==1 || n==2){
            return n;
        }

        return countWays(n-1) + countWays(n-2);
    }

}
