package TwoPointer;

public class ReverseWordsInAString {

    public static String reverseWords(String sentence) {

        // Write your code here
        String newStr = "";
        int i = sentence.length()-1;

        while(i>=0){
            while(i>=0 && sentence.charAt(i)==' '){
                i--;
            }
            int j=i;
            if(i<0){
                break;
            }
            while(i>=0 && sentence.charAt(i)!=' '){
                i--;
            }


            if(newStr.isEmpty()){
                newStr = newStr + sentence.substring(i+1,j+1);
            }
            else{
                newStr = newStr + " " + sentence.substring(i+1,j+1);
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        String s = "World Hello";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
