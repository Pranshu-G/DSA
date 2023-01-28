package Array;

public class mergeSortedArray {

    public static int[] mergeArrays(int[] arr1, int[] arr2){

        int m = arr1.length;
        int n = arr2.length;
        int i=0,j=0,k=0;
        int[] result = new int[m+n];
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            }
            else{
                result[k++] = arr2[j++];
            }
        }
        while(i<m){
            result[k++] = arr1[i++];
        }
        while(j<n){
            result[k++] = arr2[j++];
        }

        return result;
    }

}
