package GreedyTechnique;

import java.util.Arrays;

public class GasStations {

    public static int gasStationJourney(int[] gas, int[] cost) {

        if (Arrays.stream(cost).sum() > Arrays.stream(gas).sum()) // If the sum of the costs is greater than the gas
            return -1; // available to us, then we can't ever reach the same point again.
        // Setting the indexes that we will start our analysis from
        int totalGas = 0;
        int startingIndex = 0; // Setting the indexes that we will start our analysis from
        for (int i = 0; i < gas.length; i++) { // Traversing the array from start to finish
            // Checking how much gas we have left in the tank after going to the next station
            totalGas = totalGas + (gas[i] - cost[i]);
            if (totalGas < 0) {
                totalGas = 0;
                startingIndex = i + 1;
            }

        }
        return startingIndex;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(gasStationJourney(gas,cost));
    }
}
