package BitManipulation;

public class FindTheDifference {


    public static int extraCharcterIndex(String str1, String str2) {

        // Write your code here
        int result = 0;

        for(int i=0;i<str1.length();i++){
            int s = (int)str1.charAt(i);
            result = result^s;
        }

        for(int i=0;i<str2.length();i++){
            int t = (int)str2.charAt(i);
            result=result^t;
        }

        char c = (char)result;
        int ans;
        if(str1.length()>str2.length()){
            ans = str1.indexOf(c);
        }
        else{
             ans = str2.indexOf(c);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "mnop";
        String str2 = "mno";
        int result = 0;
        int length = str1.length()>str2.length()?str1.length():str2.length();
        for(int i=0;i<str1.length();i++){
            int s = (int)str1.charAt(i);
            result = result^s;
        }

        for(int i=0;i<str2.length();i++){
            int t = (int)str2.charAt(i);
            result=result^t;
        }

        char c = (char)result;
        if(str1.length()>str2.length()){
            int ans = str1.indexOf(c);
        }
        else{
            int ans = str2.indexOf(c);
        }
        System.out.println(result);
    }
}
