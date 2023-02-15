package GreedyTechnique;

import java.util.Arrays;

//To be done again
public class connectNpipes {

    public static int minCost(int[] pipes)
    {

        Arrays.sort(pipes);
        int cost = 0;
        int currCost = pipes[0] + pipes[1];
        cost = currCost;
        for(int i=2;i<pipes.length;i++){
            currCost = currCost + pipes[i];
            cost = cost + currCost;
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2, 6 };
        int cost = minCost(arr);
        System.out.println(cost);
    }
}
