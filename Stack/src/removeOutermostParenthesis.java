import java.util.Stack;
public class removeOutermostParenthesis {

    public static String removeOuterParentheses(String s) {

        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(st.size()>0){
                    res+=ch;
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(st.size()>0){
                    res+=ch;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String S = "(()())(())()";
        System.out.print(removeOuterParentheses(S));
    }
}
