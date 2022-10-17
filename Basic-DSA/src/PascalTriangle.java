import java.util.*;

public class PascalTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.

        ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
        if(n<0){
            return ans;
        }
        int i=0,j=0;
        for(i=0;i<n;i++){
            ArrayList<Long>element = new ArrayList<>();
            for(j=0;j<=i;j++){

                long temp = fact(i)/(fact(j)*fact(i-j));
                element.add(temp);
            }
            ans.add(element);
        }

        for(int k = 0; k<ans.size();k++){
            System.out.println(ans.get(k));
        }
        return ans;
    }

    public static ArrayList<ArrayList<Long>> printPascalwithoutFact(int n) {
        // Write your code here.

        ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
        if(n<0){
            return ans;
        }
        int i=0,j=0;
        for(i=0;i<n;i++){
            ArrayList<Long>element = new ArrayList<>();
            for(j=0;j<=i;j++){
                if(j==0 || j==i){
                    element.add(new Long(1));
                }
                else{
                    Long num = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    element.add(num);
                }

            }
            ans.add(element);
        }

        for(int k = 0; k<ans.size();k++){
            System.out.println(ans.get(k));
        }
        return ans;
    }
    public static long fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        printPascalwithoutFact(5);
    }

}
