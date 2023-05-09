package Subsets;

import java.util.*;

public class KSumSubset {

    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> getKSumSubsets(List<Integer> setOfIntegers, int targetSum) {
        // Write your code here

        List<Integer> tempArr = new ArrayList<>();
        helper(setOfIntegers,targetSum,0,tempArr,0);
        return ans;
    }


    public static void helper(List<Integer> setOfIntegers, int targetSum, int i,List<Integer> tempArr,int tempAns){
        if(tempAns==targetSum){
            ans.add(new ArrayList<>(tempArr));
            return;
        }
        if(tempAns>targetSum){
            return;
        }
        if(i==setOfIntegers.size() && tempAns!=targetSum){
            return;
        }

        tempAns+=setOfIntegers.get(i);
        tempArr.add(setOfIntegers.get(i));
        helper(setOfIntegers,targetSum,i+1,tempArr,tempAns);
        tempAns-=setOfIntegers.get(i);
        tempArr.remove(Integer.valueOf(setOfIntegers.get(i)));
        helper(setOfIntegers,targetSum,i+1,tempArr,tempAns);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,3,5,21,19,7,2));
        int target = 10;

        getKSumSubsets(arr,target);
        for(List<Integer> l : ans){
            for(int i: l){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
