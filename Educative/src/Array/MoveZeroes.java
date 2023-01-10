package Array;

public class MoveZeroes {
    static void moveZerosToLeft(int[] nums) {
        // TODO: Write - Your - Code
        int zeroPtr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i;j>zeroPtr;j--){
                    nums[j] = nums[j-1];
                }
                nums[zeroPtr] = 0;
                zeroPtr++;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    static void moveZeroesTOLeftOptimized(int[] nums){
        int writePtr = nums.length-1;
        int readPtr = nums.length-1;
        while(readPtr>=0){
            if(nums[readPtr]!=0){
                nums[writePtr] = nums[readPtr];
                writePtr--;
            }
            readPtr--;
        }
        while(writePtr>=0){
            nums[writePtr] = 0;
            writePtr--;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums ={1, 10, 20, 0, 59, 63, 0, 88, 0};
        moveZeroesTOLeftOptimized(nums);
    }
}
