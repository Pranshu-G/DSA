package SlidingWindow;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findRepeatedSubsequence {

    public static List<String> findRepeatedSequences(String s, int k) {

        HashMap<Integer,Integer> hmap = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<s.length()-k+1;i++){
            String t = s.substring(i,i+k);
            int code = t.hashCode();
            if(hmap.get(code)!=null){
                int temp = hmap.get(code);
                hmap.put(code,temp+1);
                if(!result.contains(t)){
                    result.add(t);
                }

            }
            else{
                hmap.put(code,1);
            }
        }
        // Your code will replace this placeholder return statement


        return result;
    }

    public static void main(String[] args) {
        List<String> s = findRepeatedSequences("AAAAACCCCCAAAAACCCCCC",8);
        for(String i:s){
            System.out.println(i);
        }
    }
}
