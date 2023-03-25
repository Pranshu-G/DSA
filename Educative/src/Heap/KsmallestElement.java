package Heap;

import java.util.Arrays;

public class KsmallestElement {

    public static int[] findKSmallest(int[] arr,int k) {

        int[] result = new int[k];
        buildHeap(arr,arr.length);
        int start=0;
        for(int i=1;i<=k;i++){
            result[start]=delete(arr,start);
            start++;
            arr = Arrays.copyOfRange(arr,1,arr.length);
            buildHeap(arr,arr.length);
        }
        // Write - Your - Code
        return result;
    }

    public static int delete(int[] heapArr, int start){
        int temp = heapArr[0];
        heapArr[0] =0;
        return temp;
    }
    public static void minHeapify(int[] heapArr,int index,int heapSize){
        int smallest = index;
        while(smallest<heapSize/2){
            int left = 2*index+1;
            int right = 2*index+2;

            if(left<heapSize && heapArr[left]< heapArr[index]){
                smallest = left;
            }
            if(right<heapSize && heapArr[right]< heapArr[smallest]){
                smallest = right;
            }

            if(index!=smallest){
                int temp = heapArr[index];
                heapArr[index] = heapArr[smallest];
                heapArr[smallest] = temp;
                index=smallest;
            }
            else{
                break;
            }
        }
    }
    public static void buildHeap(int[] heapArr,int heapSize){
        for(int i=(heapSize-1)/2;i>=0;i--){
            minHeapify(heapArr,i,heapSize);
        }
    }


    public static void main(String[] args) {
        int[] arr = {9,4,7,1,-2,6,5};
        int k =3;
       int[] result = findKSmallest(arr,k);
        for(int i:result){
            System.out.println(i);
        }
    }

}
