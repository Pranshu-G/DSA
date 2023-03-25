package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public static int findLongestSubstring(String inputString) {
        // your code will replace this placeholder return statement

        int left=0, right=inputString.length(),max=0;
        for(int i=0;i<inputString.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i;j<inputString.length();j++){

                if(!map.containsKey(inputString.charAt(j))){
                    map.put(inputString.charAt(j),1);
                }
                else{
                    left=i;
                    right=j;
                    if(j-i>max){
                        max=j-i;
                    }
                    break;
                }
            }
            if(map.size()>max){
                max=map.size();
            }
        }
        return max;
    }

    public static int findLongestSubstringOptimized(String inputString){
        HashMap<Character,Integer> map = new HashMap<>();
        int window=0,i=0,max=0;

        while(i<inputString.length()){
            if(!map.containsKey(inputString.charAt(i))){
                map.put(inputString.charAt(i),i);
            }
            else{
                if(map.get(inputString.charAt(i))>=window){
                    if(i-window>max){
                        max=i-window;

                    }
                    window=map.get(inputString.charAt(i))+1;

                }
                map.replace(inputString.charAt(i),i);
            }
            i++;
        }
        if(max<i-window){
            max=i-window;
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "abcdbea";
        System.out.println(findLongestSubstring(s));
        System.out.println(findLongestSubstringOptimized(s));

    }
}
