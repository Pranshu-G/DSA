package KWayMerge;

public class MergeSorted {




    public static int[] mergeSorted(int[] nums1, int m, int[] nums2, int n) {

        int p1=m-1;
        int p2 = n-1;
        int p = m+n-1;
        while(p>0 && p1>=0 && p2>=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[p] = nums1[p1];
                p--;
                p1--;
            }
            else{
                nums1[p]=nums2[p2];
                p--;
                p2--;
            }
        }
        while(p1>=0 && p>=0){
            nums1[p] = nums1[p1];
            p1--;
            p--;
        }
        while(p2>=0 && p>=0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        // Write your code here
        return nums1;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {4,5,6};
        int[] result = mergeSorted(arr1,3,arr2,3);
        for(int i: result){
            System.out.print(i);
        }
    }




}
