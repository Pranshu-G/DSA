package Subsets;

import java.util.ArrayList;
import java.util.Stack;

public class GenerateParenthesis {

    static ArrayList<String> ans = new ArrayList<>();
    public static ArrayList<String> generateCombinations(int n) {

        // Your code will replace this placeholder

        ArrayList<String> result = new ArrayList<String>();
        return result;
    }

    static void helper(int n,StringBuilder sb, String s, int i){
        if(i==sb.length()){
            if(isValid(sb.toString()) && !ans.contains(sb.toString())) {
                ans.add(new String(sb));
                return;
            }
        }
//        char c = s.charAt(i);
        for(int j=i;j<sb.length();j++){
            if(j != i && sb.charAt(j) == sb.charAt(i))
                continue;
            swap(sb,i,j);
            helper(n,sb, s, i+1);
            swap(sb,i,j);
        }
    }

    static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            if(s.charAt(i)==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(')');
                }
            }
            i++;
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }

    public static void main(String[] args) {
        String s = "()";
        StringBuilder sb = new StringBuilder(s.repeat(3));
        System.out.println(s.repeat(1));
        helper(3,sb,s.repeat(3), 0);
        for(String k: ans){
            System.out.print(k + " ");
        }
    }
}
