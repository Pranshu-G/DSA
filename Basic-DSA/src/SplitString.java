import java.util.*;

public class SplitString {

    public static Boolean splitString(String str) {
        // Write your code here..

        char[] arrVowel = {'a','e','i','o','u'};
        int n = str.length();

        int countA=0,countB =0;
        for (int i=0;i<n/2;i++){
            char a = str.charAt(i);
            if(a=='a'|| a == 'i'|| a=='o'||a=='e'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                countA++;
            }
        }
        for (int j=n/2;j<n;j++){
            char a = str.charAt(j);
            if(a=='a'|| a == 'i'|| a=='o'||a=='e'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                countB++;
            }
        }
        if(countA==countB){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(splitString("Aa"));
    }
}
