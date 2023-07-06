package Blind75;

public class CountBits {
    public static int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i=0;i<n+1;i++){
            int count=0;
            int k =i;
            int j =i;
            while(k!=0){
                k=(k&k-1);
                count++;
            }
            ans[j] = count;
        }
        return ans;
    }
    public static int[] countBitsDp(int n){
        int[] dp = new int[n+1];
        int offset = 1;
        for(int i=1;i<n+1;i++){
            if(offset*2==i){
                offset=i;
            }
            dp[i] = 1 + dp[i-offset];

        }
        return dp;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] ans = countBits(n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
