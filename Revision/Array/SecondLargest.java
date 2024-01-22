package Revision.Array;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public int findSecondMaximum(int[] arr)
    {
        // Write - Your - Code
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max = arr[i];
            }else if( arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void rotateArray(int[] arr){

        // Write - Your - Code
        int end = arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                arr[i]=end;
            }
            else{
                arr[i] = arr[i-1];
            }


        }

    }
    public static void reArrange(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while (start!=end){
            if(arr[start]<0){
                start++;
            }
            if(arr[end]>=0){
                end--;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
    }

    public static void maxMin(int[] arr) {
        int minIdx = 0;
        int maxIdx = arr.length-1;
        int maxElem = arr[maxIdx]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]+=(arr[maxIdx]%maxElem)*maxElem;
                maxIdx--;
            }
            else{
                arr[i]+=(arr[minIdx]%maxElem)*maxElem;
                minIdx++;
            }
            // Write - Your - Code
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/maxElem;
        }


    }

    //kadane's algorithm
    public static int findMaxSumSubArray(int[] arr){
        int currMax = arr[0];
        int globalMax = arr[0];
        for(int i=1;i<arr.length;i++){
            if(currMax<0){
                currMax=arr[i];
            }
            else{
                currMax+=arr[i];
            }

            if(currMax>globalMax){
                globalMax=currMax;
            }
        }
        return globalMax;
    }

}
