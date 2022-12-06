package String;

public class ReverseWordsInASentence {

    public static void strRev(char[] str, int start, int end){
        if(str==null || str.length<1){
            return;
        }
        while(start<end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    public static String reverseWords(char[] sentence) {
        // TODO: Write - Your - Code
        //null check
        if(sentence==null||sentence.length==0){
            return "String is empty";
        }
        //Reverse the array
        int strLen = sentence.length;
        strRev(sentence,0,strLen-1);

        // Reverse each word in place

        int start = 0;
        int end =0;
        while (true){
            if(start>=strLen-1){
                break;
            }
            while(sentence[start]==' '){
                start++;
            }

            // find end index of the word
            end = start+1;
            while (end < strLen && sentence[end] != ' ') {
                end++;
            }

            strRev(sentence,start,end-1);
            start = end;
        }
        return String.valueOf(sentence);
    }

    public static void main(String[] args) {
        String stringToReverse1 = "Hello World!";
        System.out.println("1.    Actual string:   " + stringToReverse1);
        char[] stringChar = stringToReverse1.toCharArray();
        String ans = reverseWords(stringToReverse1.toCharArray());
        System.out.println(ans);
    }
}
