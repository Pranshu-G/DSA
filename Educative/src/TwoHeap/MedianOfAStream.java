package TwoHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfAStream {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianOfAStream() {
        // Write your code here
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void insertNum(int num) {
        // Write your code here
        if(maxHeap.isEmpty() || maxHeap.peek()>=num){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if(maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        // Write your code here
       if(maxHeap.size()==minHeap.size()){
           double median = (double)(maxHeap.peek()+minHeap.peek())/2;
            return median;
       }

        return (double)maxHeap.peek();
    }
}
