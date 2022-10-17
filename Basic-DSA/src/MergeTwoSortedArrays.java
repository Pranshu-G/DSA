public class MergeTwoSortedArrays {

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        for(int i = 0; i<n;i++){
            arr1[m+i] = arr2[i];
        }
        int ans[] = bubbleSort(arr1);
        for (int j=0;j<ans.length;j++){
            System.out.println(ans[j]);
        }
        return ans;
    }

    public static int[]  bubbleSort(int arr[]){
        int n = arr.length;
        for(int i =0; i<n-1;i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = {1,4,5,7,0,0};
        int arr2[] = {3,9};
        System.out.println(ninjaAndSortedArrays(arr1,arr2,4,2));
    }
}
