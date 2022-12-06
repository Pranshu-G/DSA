package String;

import java.util.Arrays;

public class RemoveDuplicatesFromString {
    static String removeDuplicates(char[] str) {
        // TODO: Write - Your - Code
//        StringBuilder sb = new StringBuilder();
//        for(char i:str){
//            if(sb.toString().indexOf(i)==-1){
//                sb.append(i);
//            }
//            else{
//                continue;
//            }
//        }
//        return sb.toString();
        if (str == null || str.length == 0 || str[0] == '\0') {
            return "";
        }

        int writeIndex = 0;
        for (int i = 0; i < str.length; i++) {
            boolean found = false;

            // this loop checks if current character already exists,
            // if found it breaks the loop
            for (int j = 0; j < writeIndex; j++) {
                if (str[i] == str[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                str[writeIndex] = str[i];
                writeIndex++;
            }
        }

        if (writeIndex != str.length) {
            // Returns string without duplicates
            String ansStr = String.valueOf(Arrays.copyOfRange(str, 0, writeIndex));
            return ansStr;
        } else {
            String ansStr = String.valueOf(str);
            return ansStr;
        }
    }

    public static void main(String[] args) {
        char[] c = {'a','b','a','b','b','c','d','c'};
        String result = removeDuplicates(c);
        System.out.println(result);
    }
}
