package Revision.Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    public static int[] Klargest(int[] a, int k, int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(a[i]);
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[k-1-i] = pq.poll();
        }
        return ans;
        // Write your code here
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,0};
        int[] ans = Klargest(arr,3,5);
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}
