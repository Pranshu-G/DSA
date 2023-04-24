package Stack;

import java.util.Stack;

public class BasicCalculator {

    public static int calculator(String expression) {

        // Write your code here
        int curr_num=0;
        int signVal = 1;
        int res =0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(expression.charAt(i)=='('){
                s.push(res);
                s.push(signVal);
                res=0;
                signVal=1;
            }
            else if(Character.isDigit(c)){
                curr_num = curr_num*10+Character.getNumericValue(c);
            }
            else if(c=='+' || c=='-'){
                res = res + (curr_num*signVal);
                if(c=='+'){
                    signVal=1;
                }
                else{
                    signVal=-1;
                }


                curr_num=0;
            }
            else if(c==')'){
                res=res+(curr_num*signVal);
                res = res*s.pop();
                res=res+s.pop();
                curr_num=0;
            }
        }


        return res+curr_num*signVal;
    }

    public static void main(String[] args) {
        String s = "(8+100)+(13-8-(2+1))";
        System.out.println(calculator(s));
    }
}
