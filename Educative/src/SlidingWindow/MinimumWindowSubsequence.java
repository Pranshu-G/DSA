package SlidingWindow;

public class MinimumWindowSubsequence {

    public static String minWindow(String str1, String str2) {
        // Write your code here
        int sizeS1 = str1.length();
        int sizeS2 = str2.length();
        int s1 =0, s2=0;
        String minSubsequence = "";
        int length = Integer.MAX_VALUE;
        while(s1<=str1.length()){
            if(str1.charAt(s1)==str2.charAt(s2)){
                s2++;
                if(s2==sizeS2){
                    int start = s1;
                    int end = s1+1;
                }
            }
            s1++;
        }


        return "";
    }
}
