import java.util.HashMap;

import static java.lang.Math.floor;

public class MajorityElement {

    public static int findMajority(int[] arr, int n) {
        // Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        for(int j : map.keySet()){
            if(map.get(j)>floor(n/2)){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4};
        int result = findMajority(arr,7);
        System.out.println(result);
    }
}
