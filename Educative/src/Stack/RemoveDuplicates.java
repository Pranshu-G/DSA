package Stack;

import java.util.HashMap;
import java.util.Stack;

class Pair{
    int first;
    char second;

    Pair(int first,char second){
        this.first = first;
        this.second = second;
    }
}
public class RemoveDuplicates {

    public static String removeDuplicatesStack(String s) {

        // Write your code here
        String res = "";
        Stack<Pair> st = new Stack<>();
        int i=0;
        while(i < s.length()){
            char c =s.charAt(i);
            if(!st.isEmpty() && st.peek().second==c){
                Pair p = new Pair(st.peek().first+1,c);
                st.pop();
                st.push(p);
                i++;
            }
            else{
                st.push(new Pair(1,c));
                i++;
            }
            if(st.peek().first==2){
                st.pop();
            }
        }
        StringBuilder out = new StringBuilder();
        while(!st.isEmpty()){
            Pair p = st.pop();
            for (int j = 0; j < p.first; j++) {
                out.append(p.second);
            }
        }
        return out.reverse().toString();
    }
    public static String removeDuplicates(String s) {

        // Write your code here
        String res = "";
        char curr=Character.MIN_VALUE;
        char prev;
        int i=0;
        while(i<s.length()){
            prev = curr;
            curr=s.charAt(i);
            if(i==s.length()-1 && prev!=curr){
                res = res + s.charAt(i);
            }
            res = res.trim();
            if(prev==curr){
                i++;
                curr=Character.MIN_VALUE;
            }
            else if(res.length()>0 && res.charAt(res.length()-1)==curr){
                res.replace(res.charAt(res.length()-1),Character.MIN_VALUE);
                prev=curr;
                i++;
            }
            else{
                res = res + prev;
                i++;
            }

        }
        return res.trim();
    }

    public static void main(String[] args) {
        String s = "baac";
        System.out.println(removeDuplicatesStack(s));
    }
}
