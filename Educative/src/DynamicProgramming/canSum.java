package DynamicProgramming;

import java.util.HashMap;

public class canSum {

    public static boolean canSum(int target, int[] num){
        if(target==0){
            return true;
        }
        if(target<0){
            return false;
        }
        for(int i:num){
            int remainder = target-i;
            if(canSum(remainder,num)==true){
                return true;
            }
        }
        return false;
    }
    public static boolean canSumMemo(int target, int[] num, HashMap<Integer,Boolean> memo){
        if(memo.containsKey(target)){
            return memo.get(target);
        }
        if(target==0){
            return true;
        }

        if(target<0){
            return false;
        }
        for(int i:num){
            int remainder = target-i;
            if(canSum(remainder,num)==true){
                memo.put(target,true);
                return true;
            }
        }
        memo.put(target,false);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canSumMemo(7, new int[]{5,3,4,7},new HashMap<>()));
        System.out.println(canSumMemo(7, new int[]{2,4},new HashMap<>()));
        System.out.println(canSumMemo(300, new int[]{7,14},new HashMap<>()));
        System.out.println(canSum(300, new int[]{7,14}));
    }
}
