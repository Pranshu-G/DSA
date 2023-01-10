package String;

import java.util.Arrays;

public class RemoveSpaces {


    static boolean isWhiteChar(char c){

        if(c==' ' || c=='\t'){
            return true;
        }
        else{
            return false;
        }
    }

    static String removeWhiteSpaces(char[] s) {
        // TODO: Write - Your - Code
        int writeIndex = 0;
        int readIndex=0;
        while(readIndex<s.length && s[readIndex]!='\0'){
            if(!isWhiteChar(s[readIndex])){
                s[writeIndex] = s[readIndex];
                writeIndex++;
            }
            readIndex++;
        }

        if(writeIndex!=s.length){
            String ans = String.valueOf(Arrays.copyOfRange(s,0,writeIndex));
            return ans;
        }
        else{
            String ans = String.valueOf(s);
            return ans;
        }
    }
     
    public static void main(String[] args) {
        char[] s = {'A','l','l',' ','g','r','e','e','k','\t','t','o',' ','m','e'};
        for(char a: s){
            System.out.print(a);
        }
        System.out.println();
        String ans = removeWhiteSpaces(s);
        System.out.println(ans);
    }
}
