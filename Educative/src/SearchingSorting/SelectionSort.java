package SearchingSorting;

import java.util.Arrays;

public class SelectionSort {


    public static void selectionSort(int[] arr, int arrSize){
            int min;

            for(int i=0;i<arrSize;i++){

                min = findMin(arr,i,arrSize-1);

                int temp = arr[i];
                arr[i]= arr[min];
                arr[min] = temp;
            }


        printArray(arr,arrSize);


    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,-1};
         selectionSort(arr, arr.length);

    }

    static void printArray(int[] arr, int arrSize) {
        for (int i = 0; i < arrSize; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static int findMin(int[] arr, int start, int end) {
        if(end<=0 || start<0){
            return 0;
        }

        int min = start;
        for(int i= start+1;i<=end;i++){
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        return min;
    }

    int findMax(int[] arr, int start, int end) {
        if (end <= 0 || start < 0)
            return 0;

        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}
