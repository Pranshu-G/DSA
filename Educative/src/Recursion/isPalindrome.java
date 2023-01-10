package Recursion;

public class isPalindrome {

    public static Object isPalindrome(String text) {
        // Write your code here
        if(text.length()==0){
            return true;
        }
        else if(text.length()==1){
            return true;
        }
        else{
            if(text.charAt(0)==text.charAt(text.length()-1)){
                return isPalindrome(text.substring(1,text.length()-1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Object ans = isPalindrome("NAAN");
        System.out.println(ans);
    }
}
