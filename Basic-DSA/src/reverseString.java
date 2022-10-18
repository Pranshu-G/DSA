public class reverseString {

    public static String reverseString(String str) {
        // Write your code here.
        StringBuilder sb = new StringBuilder(str);
        int n = str.length();
        int j = n-1;
        for(int i=0;i<n/2;i++){
            int charEnd = n-i-1;
            char currentChar = str.charAt(i);
            sb.setCharAt(i, str.charAt(charEnd));
            sb.setCharAt(charEnd, currentChar);


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        String ans = reverseString(s);

        System.out.println(ans);
    }
}
