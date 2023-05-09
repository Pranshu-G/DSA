package Subsets;

import java.util.ArrayList;
import java.util.List;

public class PhoneCombination {


    static  ArrayList<String> ans = new ArrayList<>();
    static String[] table
            = { "0",   "1",   "abc",  "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static List<String> letterCombinations(String digits){

        // Your code will replace this placeholder return statament
        helper(digits,"",0);
        return ans;
    }

    static void helper(String digits,String tempAns,int i){
        if(i==digits.length()){
            ans.add(new String(tempAns));
            return;
        }
        int num = Character.getNumericValue(digits.charAt(i));

        for(int j=0;j<table[num].length();j++){
            helper(digits,tempAns+table[num].charAt(j),i+1);
        }
    }

    public static void main(String[] args) {
        letterCombinations("23");
        for(String s:ans){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

