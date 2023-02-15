package GreedyTechnique;

import java.util.*;

public class changeMachine {
    public static int [] coins = {25, 10, 5, 1};

    public static  ArrayList<Integer> getMinCoins(int amount)  // function to recieve change in the form of coins
    {
        ArrayList<Integer> change = new ArrayList<Integer>();
        // your awesome code goes here
        int val=0;
        int i=0;
        while(val<amount && i<coins.length ){
            if(val+coins[i]<=amount){
                val+=coins[i];
                change.add(coins[i]);
            }
            else{
                i++;
            }
        }
        return change;
    }

    public static void main(String[] args) {
        int amount = 50;
        ArrayList<Integer> result = getMinCoins(amount);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i) + " ");
        }
    }

}
