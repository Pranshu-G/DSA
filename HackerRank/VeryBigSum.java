package HackerRank;

import java.util.List;

public class VeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        long ans = 0;
        for(long i: ar){
            ans+=i;
        }
        return ans;
        // Write your code here

    }
}
