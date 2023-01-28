package TwoPointer;

public class ReverseWordsInAString {

    public static String reverseWords(String sentence) {

        // Write your code here
        String rev  = "";
        for(int i=sentence.length()-1;i>=0;i--){
            rev = rev + sentence.charAt(i);
        }

        String newStr = "";
        int start=0,end=0;

        while(start<=rev.length()-1){
            while(rev.charAt(start)==' ' && start<rev.length()-1){
                start++;
            }

            if(start==rev.length()-1){
                for(int i=start;i>=end;i--){
                    newStr = newStr + rev.charAt(i);
                }
            }
            start++;
        }
        return newStr;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
