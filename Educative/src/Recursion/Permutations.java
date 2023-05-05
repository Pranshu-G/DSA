package Recursion;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    static void helper(ArrayList<Integer> nums, int i){
        if(i==nums.size()){
           list.add(new ArrayList<>(nums));
           return;
        }

        for(int j=i;j<nums.size();j++){
            swap(nums.get(i), nums.get(j));
            helper(nums, i+1);
            swap(nums.get(i),nums.get(j));
        }

        return;
    }

    static void swap(int i, int j){
        int temp = i;
        i=j;
        j=temp;

    }
    static ArrayList<ArrayList<Integer>> Permute(ArrayList<Integer> arr){
        helper(arr,0);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3));
        Permute(arr);
    }
}
