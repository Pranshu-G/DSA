package Blind75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] arr, int t) {

        // Your code will replace this placeholder return statement
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<arr.length;i++){
          int comp = t - arr[i];
          if(map.containsKey(comp)){
              return new int[]{map.get(comp),i};
          }
          else{
              map.put(arr[i],i);
          }
      }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {-4, -8, 0, -7, -3, -10};
        int t = -15;
        int[] res = twoSum(arr, t);
        for (int i : res) {
            System.out.println(i);

        }
    }

}
