package TopKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {


    public static void main(String[] args) {
        String s = "eel";
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
