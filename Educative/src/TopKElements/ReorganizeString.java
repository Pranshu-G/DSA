package TopKElements;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {


    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        ReorganizeString permutation = new ReorganizeString();
        permutation.permute(str, 0, n - 1);
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i =0;i<s.length();i++){
//            if(!map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),1);
//            }
//            else{
//                int freq = map.get(s.charAt(i));
//                map.put(s.charAt(i),freq+1);
//            }
//        }
//
//        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
//        pq.addAll(map.entrySet());
//        Map.Entry t = pq.poll();
//        System.out.println(t);
//        if((int)t.getValue()>0){
////            map.put((char)t.getKey(),(int)t.getValue()-1);
//            Map.Entry k = new AbstractMap.SimpleEntry(t.getKey(),(int)t.getValue()-1);
//            pq.offer(k);
//            System.out.println(pq.peek());
//
//        }
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
    }

    public static String reorganizeString(String string1) {

        // Write your code here
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<string1.length();i++){
            if(!map.containsKey(string1.charAt(i))){
                map.put(string1.charAt(i),1);
            }
            else{
                int freq = map.get(string1.charAt(i));
                map.put(string1.charAt(i),freq+1);
            }
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        Map.Entry previous = null;
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty() || previous!=null){

            if(previous!=null && pq.isEmpty()){
                return "";
            }
            Map.Entry < Character, Integer > currChar = pq.poll();
            int count = currChar.getValue()-1;
            sb.append(currChar.getKey());
            if (previous!=null) {
                pq.add(previous);
                previous=null;
            }

            if(count>0){
                previous = new AbstractMap.SimpleEntry(currChar.getKey(),currChar.getValue()-1);
            }
        }
        return sb.toString();
    }
    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);

                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
