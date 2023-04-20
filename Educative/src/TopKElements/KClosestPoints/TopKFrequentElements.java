package TopKElements.KClosestPoints;

import java.util.*;

public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] arr, int k) {

        // Your code will replace this placeholder return statement
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry m: map.entrySet()){
            pq.add(m);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<Integer> topK = new ArrayList<>();
        while (!pq.isEmpty()){
            topK.add(pq.poll().getKey());
        }

        return topK;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,1,2,2,4,3};
        int k = 3;
        System.out.println(topKFrequent(arr,k));
    }
}
