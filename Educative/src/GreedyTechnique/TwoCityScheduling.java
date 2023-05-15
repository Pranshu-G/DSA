package GreedyTechnique;

public class TwoCityScheduling {

    public static int twoCityScheduling(int[][] costs) {
        // Write your code here
        int peopleA =0;
        int peopleB =0;
        int n = costs.length/2;
        int maxA=0;
        int maxB =0;
        int totalCost =0;
        for(int i=0;i<2*n;i++){
            if(costs[i][0]<=costs[i][1] && peopleA<n){
                peopleA++;
                totalCost+=costs[i][0];
                if(costs[i][0]>=costs[maxA][0]){
                    maxA=i;
                }
                else{
                    if(peopleB<n) {
                        totalCost -= costs[maxA][0];
                        totalCost += costs[maxA][1];
                        peopleA--;
                        peopleB++;
                    }
                }
            }
            else if(peopleB<n){
                peopleB++;
                totalCost+=costs[i][1];
                if(costs[i][1]>costs[maxB][1]){
                    maxB=i;
                }
                else {
                    if (peopleA < n) {
                        totalCost -= costs[maxB][1];
                        totalCost += costs[maxB][0];
                        peopleB--;
                        peopleA++;
                    }
                }
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[][] costs = {{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60}, {650, 359}, {631, 42}};
        System.out.println(twoCityScheduling(costs));
    }
}
