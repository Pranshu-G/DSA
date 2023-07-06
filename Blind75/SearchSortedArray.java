package Blind75;

import java.util.List;

public class SearchSortedArray {

    public static int binarySearchRotated(List<Integer> nums, int target){
        int low = 0;
        int high = nums.size()-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(target==nums.get(mid)){
                return mid;
            }
            if(nums.get(mid)>=nums.get(low)){
                if(nums.get(low)<=target && nums.get(mid)>=target){
                    high=mid-1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(nums.get(high)>=nums.get(mid)){
                    if(nums.get(high)>=target && nums.get(mid)<=target){
                        low = mid+1;
                    }
                    else{
                        high = mid -1;
                    }
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        List<Integer> arr = List.of(6,7,1,2,3,4,5);
        System.out.println(binarySearchRotated(arr,6));
    }
}
