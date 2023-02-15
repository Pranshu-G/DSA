package modifiedBinarySearch;

import java.util.Arrays;
import java.util.List;

public class searchInRotatedArray {

    public static int binarySearchRotated(List<Integer> nums, int target) {

        int start = 0;
        int end = nums.size()-1;

        if(start>end){
            return -1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==nums.get(mid)){
                return mid;
            }
            else if(nums.get(mid)>nums.get(start)){
                if(target>=nums.get(start) && target<nums.get(mid)){
                    end = mid-1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(target>nums.get(mid) && target<=nums.get(end)){
                    start = mid+1;
                }
                else {
                    end = mid - 1;
                }

                }
        }
        // Write your code here

        return -1;
    }

    public static void main(String args[]) {
        List < Integer > targetList = Arrays.asList(3, 6, 3, 6);
        List < List < Integer >> numList = Arrays.asList(Arrays.asList(6, 7, 1, 2, 3, 4, 5), Arrays.asList(6, 7, 1, 2, 3, 4, 5), Arrays.asList(4, 5, 6, 1, 2, 3), Arrays.asList(4, 5, 6, 1, 2, 3));
        for (int i = 0; i < targetList.size(); i++) {
            System.out.println((i + 1) + ".\tSorted array: " + numList.get(i) + "\n\ttarget " + targetList.get(i) + " found at index " + binarySearchRotated(numList.get(i), targetList.get(i)));

        }
    }
}
