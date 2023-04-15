package TopKElements;

import java.util.PriorityQueue;

public class KthLargest {
    int k;

    PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        // Write your code Here
        this.k = k;
        this.pq = new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
        }

        while(pq.size()>k){
            pq.poll();
        }

    }
    // adds element in the topKHeap
    public int add(int val) {
        // Your code will replace this placeholder return statement
        pq.offer(val);
        if(pq.size()>k){
            pq.poll();
        }
        return returnKthLargest();
    }
    // returns kth largest element from topKHeap
    public int returnKthLargest() {
        // Your code will replace this placeholder return statement

        return pq.peek();
    }


    public static void main(String[] args) {
        KthLargest k = new KthLargest(1,new int[]{1,2,3,4});
        System.out.println(k.add(5));
        System.out.println(k.add(6));
    }
}
