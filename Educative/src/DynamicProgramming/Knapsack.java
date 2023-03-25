package DynamicProgramming;

import java.util.List;

public class Knapsack {

    public static int findKnapsack(int capacity, List<Integer> weights, List<Integer> values, int n){
        // Write your code here
        if(capacity==0 || n==0){
            return 0;
        }

        if(weights.get(n-1)<capacity){
            return Math.max(values.get(n-1) + findKnapsack(capacity- weights.get(n-1),weights,values,n-1)
            , findKnapsack(capacity,weights,values,n-1));
        }

        else{
            return findKnapsack(capacity,weights,values,n-1);
        }
        // your code will replace the placeholder return statement below
    }

    public static int findKnapSackDPMemo(int[][] memo,int capacity, List<Integer>weights,List<Integer>values,int currentIndex){

        if(currentIndex>=0 || capacity==0){
            return 0;
        }

        if(memo[currentIndex][capacity]!=0){
            return memo[currentIndex][capacity];
        }
        int profit1=0;
        if(weights.get(currentIndex)<=capacity){
            profit1 = values.get(currentIndex) + findKnapSackDPMemo(memo,capacity- weights.get(currentIndex),weights,values,currentIndex+1);
        }

        int profit2 = findKnapSackDPMemo(memo,capacity,weights,values,currentIndex+1);
        memo[currentIndex][capacity] = Math.max(profit1,profit2);
        return memo[currentIndex][capacity];
    }


    public static int solveKnapsack(int capacity,List<Integer> weights, List<Integer>values){
        int[][] memo = new int[weights.size()+1][capacity+1];
        return findKnapSackDPMemo(memo,capacity,weights,values,0);
    }
    public static int findKnapsackTab(int capacity, List<Integer> weights, List<Integer> values, int n){
        int[][] dp = new int[n+1][capacity];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }

                if(weights.get(i-1)<j){
                    dp[i][j]= Math.max(values.get(i-1)+dp[i-1][j- weights.get(i-1)],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[][] temp = new int[5][6];
        System.out.println(temp.length);

    }
}
