
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TwoSum {

    static int[] twoSum(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int targetArr[] = new int[2];
        HashSet<Integer> hashset = new HashSet<>();
        for(int i=0; i<arr.size();i++){
            int req = n-arr.get(i);
            if(hashset.contains(req)){
                targetArr[0] = arr.get(i);
                targetArr[1] = req;
            }
            else{
                hashset.add(arr.get(i));
            }

        }
        System.out.println(targetArr[0]);
        System.out.println(targetArr[1]);
        return targetArr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList a = new ArrayList<Integer>(List.of(1,2,3,4,5));
        int target = 9;
        twoSum(a,target);
    }
}
