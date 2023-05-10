package GreedyTechnique;

import java.util.Arrays;

public class BoatCount {

    public static int rescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int light = 0;
        int heavy = people.length-1;
        int boatCount = 0;
        while(heavy>=light){
            boatCount++;
            if(people[light]+people[heavy]<=limit){
                light++;
                heavy--;

            }
            else{
                heavy--;

            }
        }

        return boatCount;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 4};
        int limit = 4;
        System.out.println(rescueBoats(arr,limit));
    }
}
