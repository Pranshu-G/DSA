package Array;

public class FindLowHigh {

    static int findLowIndex(int[] nums, int target) {
        // TODO: Write - Your - Code
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==target){
//                return i;
//            }
//        }
        int low = 0;
        int high = nums.length-1;
        int mid = high/2;

        while(low<=high){
            int midElem = nums[mid];
            if(midElem<target){
                low = mid+1;
            }

            else{
                high = mid-1;
            }

            mid = low+(high-low)/2;
        }
        if(low<nums.length && nums[low] == target){
            return low;
        }
        return -1;
    }

    static int findHighIndex(int[] nums, int target) {
        // TODO: Write - Your - Code
//        for(int i=nums.length-1;i>0;i--){
//            if(nums[i]==target){
//                return i;
//            }
//        }
//        return -2;
        int low = 0;
        int high = nums.length-1;
        int mid = high/2;
        while(low<=high){
            int midElem = nums[mid];
            if(midElem<=target){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
            mid = low+(high-low)/2;
        }

        if(high==-1){
            return high;
        }
        if(high<nums.length && nums[high]== target){
            return high;
        }
        return -1;
    }
    static int findHighIndexnew(int[] nums, int target) {
            int low = 0;
            int high = nums.length-1;
            int mid = high/2;
            while(low<=high){
                int midElem = nums[mid];
                if(midElem<=target){
                    low = mid +1;
                }
                else{
                    high = mid-1;
                }
                mid = low+(high-low)/2;
            }

            if(high==-1){
                return high;
            }
            if(high<nums.length && nums[high]== target){
                return high;
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] arr = {1,2,2,5,5,5,5,6};
        int low = findLowIndex(arr,5);
        int high = findHighIndex(arr,5);
        System.out.println(low+" "+high);
    }
}
