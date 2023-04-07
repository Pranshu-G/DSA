package TwoHeap;

import java.util.*;

public class MaximizeCapital {

    public static int maximumCapital(int c, int k, int[] capitals,int[] profits) {

        // replace the dummy return with your code
        PriorityQueue<int[]> s = new PriorityQueue<>();
        s.add(new int[]{1,3});
        PriorityQueue<Integer>capitalPq = new PriorityQueue<>();
        PriorityQueue<Integer> profitPq = new PriorityQueue<>(Collections.reverseOrder());
        int currCapital = c;

        for(int i=0;i<capitals.length;i++){
            capitalPq.add(capitals[i]);
        }
        for(int i=0;i<profits.length;i++){
            if(capitals[i]<currCapital){
                profitPq.add(profits[i]);
            }
            else{
                currCapital+=profitPq.poll();
                if(currCapital>=capitals[i]){
                    profitPq.add(capitals[i]);
                }
            }
        }


        return -1;
    }

    public static int maximumCapitalTest(int c, int k, int[] capital, int[] profits) {
        int n = capital.length;
        int currentCapital = c;
        // Insert all capitals values to a min-heap
        PriorityQueue<int[]> capitalMinHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<capital.length;i++){
            capitalMinHeap.offer(new int[]{capital[i],i});
        }
        PriorityQueue<int[]> profitMaxHeap = new PriorityQueue<>((a,b)->b[0]-a[0]);
        int i=0;
        while(i<k){
            while(!capitalMinHeap.isEmpty() && capitalMinHeap.peek()[0]<=currentCapital){
                int[] j = capitalMinHeap.poll();
                profitMaxHeap.offer(new int[]{profits[j[1]],j[1]});
            }
            if(profitMaxHeap.isEmpty()){
                break;
            }
            int x = profitMaxHeap.poll()[0];
            currentCapital+=x;
            i++;
        }
        return currentCapital;
    }

    public static void main(String[] args) {
       int ans= maximumCapitalTest(1,2,new int[]{1,2,2,3},new int[]{2,4,6,8});
        System.out.println(ans);

    }
}

