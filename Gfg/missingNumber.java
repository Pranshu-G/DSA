package Gfg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class missingNumber {

    int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            if(array[i]!=i+1){
                return i+1;
            }
        }

        return -1;
    }

    //duplicates question
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int val = map.get(arr[i]);
                map.put(arr[i],val+1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer key : map.keySet()){
            if(map.get(key)>1){
                ans.add(key);
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
    return ans;
    }

    //leaders in an array

    static ArrayList<Integer> leadersOpt(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int pre = 0;
        for(int i = n-1;i>=0;i--){
            if(arr[i]>=pre){
                ans.add(arr[i]);
                pre=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int curr= arr[i];
            boolean flag = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>curr){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
