package TwoPointer;

public class validPalindrome {

    public static boolean isPalindrome(String s) {
        // Write your code here
        // Tip: You may use the code template provided
        // in the TwoPointers.java file

        int start = 0;
        int end = s.length()-1;

        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = isPalindrome("baaba");
        System.out.println(res);
    }
}
