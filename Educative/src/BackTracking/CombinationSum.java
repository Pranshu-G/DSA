package BackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CombinationSum {

    public static List<List<Integer>> ans = new ArrayList<>();


    public static void helper(int[] candidates,int target, List<Integer> tempAns, int CurrSum, int i){
        // bounding condition
        if(CurrSum>target){
            return;
        }

        // base condition
        if(i==candidates.length){
            if(CurrSum==target){
                ans.add(new ArrayList<>(tempAns));
            }
            return;
        }

        CurrSum+=candidates[i];
        tempAns.add(candidates[i]);
        helper(candidates, target, tempAns, CurrSum, i);
        CurrSum-=candidates[i];
        tempAns.remove(Integer.valueOf(candidates[i]));
        helper(candidates,target,tempAns,CurrSum,i+1);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        ArrayList<Integer> temp = new ArrayList<>();
        helper(candidates,target,temp,0,0);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        combinationSum(arr,7);
        for(List<Integer> l : ans){
            for(int i: l){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
