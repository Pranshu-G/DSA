package Stack;

import java.util.ArrayList;
import java.util.Stack;

class Parentheses{
    char p;
    int index;

    Parentheses(char p, int index){
        this.p = p;
        this.index = index;
    }
}
public class minRemoveParenthesis {

    public static String minRemoveParentheses(String s) {

        // Your code will replace the placeholder return statement.
        Stack<Parentheses> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                st.push(new Parentheses('(',i));
            }
            else if(s.charAt(i)==')'){
                if(!st.isEmpty() && st.peek().p=='('){
                    st.pop();
                }
                else{
                    st.push(new Parentheses(')',i));
                }

            }
            i++;
        }
        while(!st.isEmpty()){
            int x = st.pop().index;
            arr.add(x);
        }
        StringBuilder sb = new StringBuilder();
        int j=0;
        while(j<s.length()){
            if(arr.contains(j)){
                j++;
            }
            else{
                sb.append(s.charAt(j));
                j++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab)ca(so)(sc(s)(";
        System.out.println(minRemoveParentheses(s));
    }
}
