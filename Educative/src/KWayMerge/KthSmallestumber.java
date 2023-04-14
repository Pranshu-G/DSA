package KWayMerge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestumber {

    public static int kSmallestNumber(List<List<Integer>> lists, int k) {

        // Your code will replace this placeholder return statement
        int listLength = lists.size();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        List<Integer> emptyList = Arrays.asList();
        for(int i=0;i<listLength;i++){
            if(lists.get(i).equals(emptyList)){
                continue;
            }
            else{
                pq.offer(new int[]{lists.get(i).get(0),0,i});
            }
        }

        int smallestNum=0,numsChecked=0;
        while(!pq.isEmpty()){

            int[] smallest = pq.poll();
            smallestNum = smallest[0];
            numsChecked++;

            if(numsChecked==k){
                break;
            }

            if(smallest[1] + 1 < lists.get(smallest[2]).size()){
                pq.offer(new int[]{lists.get(smallest[2]).get(smallest[1]+1),smallest[1]+1,smallest[2]});
            }
        }
        return smallestNum;
    }



}
