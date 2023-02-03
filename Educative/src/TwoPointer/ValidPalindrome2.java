package TwoPointer;

public class ValidPalindrome2 {

    public static boolean isPalindrome(String s) {
        // Write your code here
        // Tip: You may use the code template provided
        // in the TwoPointers.java file
        int start=0;
        int end = s.length()-1;
        int count=0;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else if(count<1 && s.charAt(start+1)==s.charAt(end)){
                count++;
                start+=2;
                end--;
            }
            else if(count<1 && s.charAt(start) == s.charAt(end-1)){
                count++;
                start++;
                end-=2;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abbabab";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }
}
