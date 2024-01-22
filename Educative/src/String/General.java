package String;

public class General {
    public static String reverseWords(char[] sentence) {
        // TODO: Write - Your - Code
     int start = 0;
     int end = sentence.length-1;
     while(start<=end){
         char temp = sentence[start];
         sentence[start] = sentence[end];
         sentence[end] = temp;
         start++;
         end--;
     }

        return String.valueOf(sentence);
    }
}
