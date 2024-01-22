package Revision.Array;

import java.util.HashSet;
import java.util.List;

public class General {
    static int binarySearch(int[] nums, int target) {
        // TODO: Write - Your - Code
        int low = 0;
        int high = nums.length - 1;
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static void rotateArray(List<Integer> nums, int n) {
        // TODO: Write - Your - Code
        int length = nums.size();
        n = n%length;
        if(n<0){
            n=length+n;
        }
        reverse(nums,0,length-1);
        reverse(nums,0,n-1);
        reverse(nums,n,length-1);

    }

    static void reverse(List<Integer> nums,int start, int end){
        while(start!=end){
            int temp = nums.get(start);
            nums.set(start,nums.get(end));
            nums.set(end,temp);
            start++;
            end--;

        }
    }
    static int binarySearchRotated(int[] nums, int target) {
        // TODO: Write - Your - Code
        int start = 0;
        int end = nums.length-1;
        if(start>end){
            return -1;
        }

        while(start<=end){
            int mid = start + (end- start)/2;
            if(nums[mid]==target){
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if(nums[start]<=target && target<nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                if(nums[mid]<=target && target<nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
        }

        return -1;
    }

    static Integer findLeastCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
        // TODO: Write - Your - Code
        int i=0,j=0,k=0;
        int l1= arr1.length;
        int l2 = arr2.length;
        int l3 = arr3.length;
        while (i<l1 && j<l2 && k<l3){
            if(arr1[i]==arr2[j] && arr1[i]==arr3[k]){
                return arr1[i];
            }
            else if(arr1[i]>=arr2[j] && arr3[k]>=arr2[j]){
                j++;
            }
            else if(arr2[j]>=arr1[i] && arr3[k]>=arr1[i]){
                i++;

            }
            else if(arr1[i]>=arr3[k] && arr2[j]>=arr3[k]){
                k++;
            }
        }

        return -1;
    }

    static int findLowIndex(int[] nums, int target) {
        // TODO: Write - Your - Code
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target) {
                    start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        if(start<nums.length && nums[start] == target){
            return start;
        }

        return -1;
    }

    static int findHighIndex(int[] nums, int target) {
        // TODO: Write - Your - Code
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<=target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        if(end<nums.length && nums[end]==target){
            return end;
        }

        return -1;
    }

    static void moveZerosToLeft(int[] nums) {
        // TODO: Write - Your - Code
        int readPtr = nums.length-1;
        int writePtr = nums.length-1;

        while(readPtr>=0){

            if(nums[readPtr]!=0){
                nums[writePtr] = nums[readPtr];
                writePtr--;

            }
            readPtr--;
        }

        for(int i = 0;i <= writePtr;i++){
            nums[i] = 0;
        }
    }

    static boolean findSumOfTwo(int[] A, int val) {
        //TODO: Write - Your - Code
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            int diff = val - A[i];
            if(set.contains(diff)){
                return true;
            }
            else{
                set.add(A[i]);
            }
    }
        return false;
}
}
