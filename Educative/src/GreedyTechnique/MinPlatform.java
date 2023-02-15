package GreedyTechnique;

public class MinPlatform {

    public static int findPlatform(int[] arrival, int[] departure) {
        //write your code here
        int i=0;
        int j =0;
        int count =1;
        while(i<arrival.length && j<departure.length){
            if(arrival[i+1]>departure[j]){
                j++;
            }
            if(arrival[i+1]<departure[j]){
                j++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arrival,departure));
    }
}
