package Subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutations {

    static ArrayList<String> ans = new ArrayList<>();

    static void helper(StringBuilder sb,int i){
        if(i==sb.length()){
            ans.add(sb.toString());
            return;
        }

        for(int j=i;j<sb.length();j++){
            swap(sb,i,j);
            helper(sb,i+1);
            swap(sb,i,j);
        }
    }

    public static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
    public static ArrayList<String> permuteWord(String word) {

        StringBuilder sb = new StringBuilder(word);
        // Your code will replace this placeholder return statement
        helper(sb,0);
        return ans;
    }

    public static void main(String[] args) {
        String t = "aa";
        permuteWord(t);
        for(String s:ans){
            System.out.println(s);
        }
    }
}
