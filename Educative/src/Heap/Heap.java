package Heap;

import java.util.Arrays;

public class Heap {


    public void maxHeapify(int[] heapArray,int index,int heapSize){
        int largest = index;
        while(index<heapSize/2){
            int left = 2*index+1;
            int right = 2*index+2;

            if(left<heapSize && heapArray[left] > heapArray[index]){
                largest=left;
            }
            if(right<heapSize && heapArray[right] > heapArray[largest]){
                largest=right;
            }

            if(index!=largest){
                int temp = heapArray[largest];
                heapArray[largest]=heapArray[index];
                heapArray[index]=temp;
                index=largest;
            }
            else{
                break;
            }
        }
    }


    public void buildMaxHeap(int[] heapArray, int heapSize){

        for(int i=(heapSize-1)/2;i>=0;i--){
            maxHeapify(heapArray,i,heapSize);
        }
    }

    private static void minHeapify(int[] heapArray, int index, int heapSize){
        int smallest = index;
        while(smallest<heapSize/2){
            int left = 2*index+1;
            int right = 2*index+2;

            if(left<heapSize && heapArray[left]<heapArray[index]){
                smallest=left;
            }
            if(right<heapSize && heapArray[right]<heapArray[smallest]){
                smallest=right;
            }

            if(smallest!=index){
                int temp = heapArray[index];
                heapArray[index] = heapArray[smallest];
                heapArray[smallest] = temp;
                index = smallest;
            }
            else{
                break;
            }
        }
    }

    public static void buildMinHeap(int[] heapArray, int heapSize){
        for(int i=(heapSize-1)/2;i>=0;i--){
            minHeapify(heapArray,i,heapSize);
        }
    }

    public static void main(String[] args) {
        int[] heapArray = { 9,4,7,1,-2,6,5};
//        System.out.println("Before heapify: "+ Arrays.toString(heapArray));
//        new Heap().buildMaxHeap(heapArray, heapArray.length);
//        System.out.println("After heapify: "+Arrays.toString(heapArray));
        System.out.println("Before minheapify: "+ Arrays.toString(heapArray));
        buildMinHeap(heapArray, heapArray.length);
        System.out.println("After minheapify: "+Arrays.toString(heapArray));
    }
}
