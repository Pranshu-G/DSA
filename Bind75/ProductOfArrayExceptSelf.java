package Bind75;

public class ProductOfArrayExceptSelf {

    public static int[] product(int[] arr) {

        // Write your code here
        int[] ans = new int[arr.length];
        int left =1;
        int right =1;
        for(int i=0;i<ans.length;i++){
            ans[i] = 1;
        }

        for(int i=0;i<ans.length;i++){
            ans[i]*=left;
            left*=arr[i];
        }

        for(int i=arr.length-1;i>=0;i--){
            ans[i]*=right;
            right*=arr[i];
        }
        return ans;
    }

}
