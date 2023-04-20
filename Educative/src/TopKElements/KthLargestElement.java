package TopKElements;

import java.util.PriorityQueue;

public class KthLargestElement {


   public static int findKthLargest(int[] arr, int k) {

    // Your code will replace this placeholder return statement
       PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       for(int i=0;i<k;i++){
           minHeap.offer(arr[i]);
       }

       for(int i=k;i<arr.length;i++){
           if(arr[k]>=minHeap.peek()){
               minHeap.poll();
               minHeap.offer(arr[i]);
           }
       }
    return minHeap.peek();
}

    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};

        int k = 2;
        System.out.println(findKthLargest(arr,k));

    }

    // function to add 2 numbers
   
}
