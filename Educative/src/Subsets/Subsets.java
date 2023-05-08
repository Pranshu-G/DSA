package Subsets;

import java.util.*;

public class Subsets {

    public static List<HashSet<Integer>> helper(List<Integer> v, int i, HashSet<Integer> currAns, List<HashSet<Integer>> setList){
        if(i==v.size()){
            setList.add(new HashSet<>(currAns));
            return setList;
        }
        currAns.add(v.get(i));
        helper(v,i+1,currAns,setList);
        currAns.remove(v.get(i));
        helper(v,i+1,currAns,setList);
        return setList;
    }
    public static List<HashSet<Integer>> findAllSubsets(List<Integer> v) {
        // Write your code here

        // Your code will replace the below return placeholder

        List<HashSet<Integer>> setsList = new ArrayList<HashSet<Integer>>();
        HashSet<Integer> h = new HashSet<>();
        List<HashSet<Integer>> ans  = helper(v, 0, h, setsList);
        return ans;
    }

    public static void main(String[] args) {
        List<Integer>arr = new ArrayList<>(List.of(1,2,3));
        List<HashSet<Integer>> ans = findAllSubsets(arr);
        for(HashSet<Integer> i : ans){
            for(Integer j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
