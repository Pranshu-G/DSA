package Bind75;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        s = s.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        while(start<=end){
            if(s.charAt(start)==' '){
                start++;
            }
            else if(s.charAt(end)==' '){
                end --;
            }
            else if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s =
            "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}
