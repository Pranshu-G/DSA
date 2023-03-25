package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class minWindowSubstring {

    public static String minWindow(String s, String t){
        if(s==null || t==null || s.isEmpty() || t.isEmpty())return "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int i=0,j=0,count = map.size();
        int left=0,right=s.length()-1,min=s.length();
        boolean found=false;
        while(j<s.length()){
            char endChar = s.charAt(j++);
            if(map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    count -= 1;
                }
            }
                if(count>0){
                    continue;
                }

                while (count==0){
                    char startChar = s.charAt(i++);
                    if(map.containsKey(startChar)) {
                        map.put(startChar, map.get(startChar) + 1);
                        if (map.get(startChar) > 0) {
                            count += 1;
                        }
                    }
                }
                if((j-i)<min){
                   left=i;
                   right=j;
                   min=j-i;
                   found=true;
                }
        }

        return !found? "": s.substring(left-1,right);
    }
    public static String minWindow1(String s, String t){
        if(s==null||t==null||s.isEmpty()||t.isEmpty()){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int i=0,j=0,count=map.size();
        int left=0,right=s.length()-1,min=s.length();
        boolean found = false;

        while(j<s.length()){
            char endChar = s.charAt(j++);
            if(map.containsKey(endChar)){
                map.put(endChar,map.get(endChar)-1);
                if(map.get(endChar)==0){
                    count--;
                }
            }


            if(count>0){
                continue;
            }
            while(count==0){
                char startChar = s.charAt(i++);
                if(map.containsKey(startChar)){
                    map.put(startChar, map.get(startChar)+1);
                    if(map.get(startChar)>0){
                        count++;
                }

                }
            }
            if(j-i<min){
                left=i;
                right=j;
                min=j-i;
                found=true;

            }
        }

        return !found?"":s.substring(left-1,right);
    }
    public static void main(String[] args) {
        String s = minWindow("ACBBACA","ABA");
        String s1 = minWindow1("ACBBACA","ABA");
        System.out.println(s);
        System.out.println(s1);
    }
}
