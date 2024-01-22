package Revision.Array;



import java.util.ArrayList;
import java.util.List;

public class InfiniteArraySum {
    private static int mod = (int) 1e9 + 7;
    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> ans = new ArrayList<>();
        int[] sum = new int[n+1];
        for(int i=1;i<=n;i++){
            sum[i] = (sum[i-1] + arr[i-1])%mod;
        }

        for(int i =0;i<q;i++){
            List<Long> range = queries.get(i);
            long l = range.get(0);
            long r = range.get(1);
            long rsum = func(sum,r,n);
            long lsum = func(sum, l-1, n);
            ans.add((int)((rsum-lsum+mod)%mod));
        }
        return ans;
        // Write your code here!

    }

    static long func(int[] sum, long i, int n){
        long count = (i/n)%mod;
        long res = (count*sum[(int)n])%mod;
        res = (res + sum[(int)(i%n)])%mod;
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,55,5,5,5,55,5,5,5,55,5};
        int n =2;
        int q =1;
        List<List<Long>> ans = new ArrayList<>();
        List<Long> temp = List.of(Long.valueOf(1),Long.valueOf(11));
        ans.add(temp);
        List<Integer> res =sumInRanges(arr,4,ans,1);
        for(Integer i: res){
            System.out.println(i);
        }

    }


//    public static List<Integer> sumInRanges1(int[] arr, int n, List<List<Long>> queries, int q) {
//        List<Integer> ans = new ArrayList<Integer>();
//        long[] sumArray = new long[n + 1];
//        for (int i = 1; i <= n; i++) {
//            sumArray[i] = (sumArray[i - 1] + arr[i - 1]) % mod;
//        }
//
//        for (List<Long> range : queries) {
//            long l = range.get(0);
//            long r = range.get(1);
//
//            long rsum = func(sumArray, r, n);
//            long lsum = func(sumArray, l - 1, n);
//
//            ans.add((int) ((rsum - lsum + mod) % mod));
//        }
//
//        return ans;
//    }
//
//    private static long func(long[] sumArray, long x, long n) {
//        long count = (x / n) % mod;
//        long res = (count * sumArray[(int) n] % mod);
//        res = (res + sumArray[(int) (x % n)]) % mod;
//        return res;
//    }
}

