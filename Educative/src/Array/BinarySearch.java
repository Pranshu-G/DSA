package Array;

public class BinarySearch {

    static int binarySearchIterative(int[] nums, int target) {
        // TODO: Write - Your - Code

        // time complexity O(log n)
        // space complexity O(1)
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low + (high-low/2));
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
        }

        return -1;
    }

    static int binarySearchRecursive(int[] nums, int target,int high,int low){

       // time complexity O(log n)
        // space complexity O(log n)
        if(low<=high){
            int mid = low + (high-low/2);
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=target){
                high=mid-1;
                return binarySearchRecursive(nums,target,high,low);
            }
            else if(nums[mid]<=target){
                low = mid+1;
                return binarySearchRecursive(nums,target,high,low);
            }

        }
        return -1;
    }



    public static void main(String[] args) {
        int[] nums = {1,3,4,6,8,19};
        int target = 19;
        int result = binarySearchRecursive(nums,target,nums.length-1,0);
        System.out.println(result);
    }
}
