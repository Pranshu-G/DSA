package Heap;

import java.util.Arrays;



public class MaxHeapToMin {


    public static void convertMax(int[] maxHeap) {
        int n = maxHeap.length;

        for(int i = n/2-1;i>=0;i--) {
            int index = i;
            int smallest = index;
            while (smallest < n / 2) {
                int left = 2 * index + 1;
                int right = 2 * index + 2;

                if (left < n && maxHeap[left] < maxHeap[index]) {
                    smallest = left;
                }
                if (right < n && maxHeap[right] < maxHeap[smallest]) {
                    smallest = right;
                }

                if (smallest != index) {
                    int temp = maxHeap[smallest];
                    maxHeap[smallest] = maxHeap[index];
                    maxHeap[index] = temp;
                    index = smallest;
                }
            }
        }

        //Write Your Code Here
    }

    public static void main(String[] args) {
        int[] maxHeapArr= {9,4,7,1,-2,6,5};
        System.out.println("Before minheapify: "+ Arrays.toString(maxHeapArr));
        new Heap().buildMinHeap(maxHeapArr, maxHeapArr.length);
        System.out.println("After minheapify: "+Arrays.toString(maxHeapArr));
    }
}
