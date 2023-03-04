package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class howSum {

    public static ArrayList<Integer> howSum(int target, int[] num) {

        if (target == 0) {
            return new ArrayList<>();
        }

        if (target < 0) {
            return null;
        }

        for (int i : num) {
            int remainder = target - i;
            ArrayList<Integer> result = howSum(remainder, num);
            if (result != null) {
                result.add(i);
                return result;
            }
        }

        return null;
    }

    public static ArrayList<Integer> howSumMemo(int target, int[] num) {

        if (target == 0) {
            return new ArrayList<>();
        }

        if (target < 0) {
            return null;
        }

        for (int i : num) {
            int remainder = target - i;
            ArrayList<Integer> result = howSum(remainder, num);
            if (result != null) {
                result.add(i);
                return result;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,5};
        int target = 8;
        System.out.println(howSum(target,nums));
    }

}
