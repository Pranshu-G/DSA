package TwoHeap;

import javax.swing.*;
import java.beans.Introspector;
import java.util.*;

public class SlidingWindowMedian {

    public static double[] medianSlidingWindow(int[] nums, int k) {
        // Your code will replace this placeholder return statement
        double[] medianArr = new double[nums.length/k+1];
        int n=nums.length;
        for(int i=0;i<n-k+1;i++){
            ArrayList<Integer>temp = new ArrayList<>();
            for(int j=i;j<i+k;j++){
                temp.add(nums[j]);
                if(j==i+k-1){
                    double median=0;
                    temp.sort((a,b)->a-b);
                    if(k%2!=0){
                        median = temp.get(k)/2;
                   }
                    else{
                        double first = (temp.get((k-1)/2));
                        double second = (temp.get((k-1)/2+1));
                        median = (first+second)/2;
                    }
                    medianArr[i]=median;
                }
            }
        }
        return medianArr;
    }
    public static double[] medianSlidingWindowOptimized(int[] nums, int k){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        List<Double> medians = new ArrayList<Double>();
        PriorityQueue<Integer> smallList = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> largeList = new PriorityQueue<>();
        int i =0;
        while(i<k){
            smallList.add(nums[i]);
            i++;
        }
        for(int j=0;j<k/2;j++){
            largeList.add(smallList.peek());
            smallList.poll();
        }

        while(true){
            //odd even check
            if((k&1)==1){
                medians.add((double)smallList.peek());
            }
            else{
                double temp = ((double)smallList.peek() + (double)largeList.peek())*0.5;
                medians.add(temp);
            }
            if(i>=nums.length){
                break;
            }
            int outNum = nums[i-k];
            int inNum = nums[i];
            i++;
            int balance =0;


            // Number `outNum` exits window
            if(outNum<=smallList.peek()){
                balance+=-1;
            }
            else{
                balance+=1;
            }

               /* If the outgoing element is not present in the hash-map
                 store the `outNum` in the hash-map with value 1,
                 otherwise increment the count of `outNum` in the hash-map.*/
            if(hashMap.get(outNum)!=null){
                int tempVal = hashMap.get(outNum) + 1;
                hashMap.put(outNum,tempVal);
            }
            else{
                hashMap.put(outNum,1);
            }

            // number `inNum` enters window
            if(!smallList.isEmpty() && inNum<=smallList.peek()){
                balance++;
                smallList.add(inNum);
            }
            else{
                balance--;
                largeList.add(inNum);
            }

            // Re-balance smallList
            if(balance<0){
                smallList.add(largeList.peek());
                largeList.poll();
                balance++;
            }

            // Re-balance largeList
            if(balance>0){
                largeList.add(smallList.peek());
                smallList.poll();
                balance--;
            }
            // Remove invalid numbers that should be discarded from smallList heap tops
            while(hashMap.get(smallList.peek())!=null && hashMap.get(smallList.peek())>0){
                int tempVal = hashMap.get(smallList.peek())-1;
                hashMap.put(smallList.peek(),tempVal);
                smallList.poll();
            }
            // Remove invalid numbers that should be discarded from largeList heap tops

            while(!largeList.isEmpty() && hashMap.get(largeList.peek())!=null && hashMap.get(largeList.peek())>0){
                int tempVal = hashMap.get(largeList.peek())-1;
                hashMap.put(largeList.peek(),tempVal);
                largeList.poll();
            }
        }

        double[] arr = medians.stream().mapToDouble(Double::doubleValue).toArray();
        return arr;

    }

    public static double[] medianSlidingWindowOptimized2(int[] nums, int k){
        ArrayList<Double> medians = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        PriorityQueue<Integer>smallList= new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>largeList = new PriorityQueue<>();
        int i = 0;
        while(i<k){
            smallList.add(nums[i]);
            i++;
        }

        for(int j=0;j<k/2;j++){
            largeList.add(smallList.peek());
            smallList.poll();
        }

        while(true){
            if(k%2!=0){
                double median = smallList.peek();
                medians.add(median);
            }
            else{
                double median = ((double)smallList.peek() + (double)largeList.peek())/2;
                medians.add(median);
            }

            if(i>=nums.length){
                break;
            }

            int outgoingNum = nums[i-k];
            int incomingNum = nums[i];
            i++;
            int balance =0;
            if(outgoingNum<=smallList.peek()){
                balance+=-1;
            }
            else{
                balance+=1;
            }
            if(hashMap.get(outgoingNum)!=null){
                int temp = hashMap.get(outgoingNum)+1;
                hashMap.put(outgoingNum,temp);
            }
            else{
                hashMap.put(outgoingNum,1);
            }

            if(!smallList.isEmpty() && incomingNum<=smallList.peek()){
                smallList.add(incomingNum);
                balance+=1;
            }
            else{
                largeList.add(incomingNum);
                balance--;
            }

            if(balance>0){
                largeList.add(smallList.peek());
                smallList.poll();
                balance--;
            }

            if(balance<0){
                smallList.add(largeList.peek());
                largeList.poll();
                balance++;
            }

            while(hashMap.get(smallList.peek())!=null && hashMap.get(smallList.peek())>0){
                int temp = hashMap.get(smallList.peek())-1;
                hashMap.put(smallList.peek(),temp);
                smallList.poll();
            }

            while(!largeList.isEmpty() && hashMap.get(largeList.peek())!=null && hashMap.get(largeList.peek())>0){
                int temp = hashMap.get(largeList.peek())-1;
                hashMap.put(largeList.peek(),temp);
                largeList.poll();
            }
        }

        double[] arr = medians.stream().mapToDouble(Double::doubleValue).toArray();
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k =3;
        double[] ans = medianSlidingWindowOptimized2(arr,k);
        for(double d:ans){
            System.out.print(d + " ");
        }
    }

}
