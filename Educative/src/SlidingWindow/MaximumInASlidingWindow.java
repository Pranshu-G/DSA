package SlidingWindow;

import java.util.*;

public class MaximumInASlidingWindow {

    public static List<Integer> findMaxSlidingWindow(List<Integer> nums, int windowSize) {
        List<Integer> result = new ArrayList<Integer>();
        Deque<Integer> window = new ArrayDeque<>();
        if(nums.size()<windowSize){
            windowSize = nums.size();
        }

        for(int i=0;i<windowSize;i++){

            while(!window.isEmpty() && nums.get(i)>= nums.get(window.peekLast())){
                window.removeLast();
            }
            window.addLast(i);
        }
        result.add(nums.get(window.peek()));
        for(int i = windowSize;i<nums.size();i++){

            while(!window.isEmpty() && nums.get(i)>=nums.get(window.peekLast())){
                window.removeLast();
            }

            if(!window.isEmpty() && window.peek()<i-windowSize){
                window.removeFirst();
            }
            window.addLast(i);
            result.add(nums.get(window.peek()));
        }
        // write yout code here
        return result;
    }

    public static List<Integer> findMaxSlidingWindow2(List<Integer>nums, int windowSize){
        List<Integer> result = new ArrayList<Integer>();
        Deque<Integer> window = new ArrayDeque<>();
        if(windowSize>nums.size()){
            windowSize = nums.size();
        }
        for(int i=0;i<windowSize;i++){

            while(!window.isEmpty() && nums.get(i)>=nums.get(window.peekLast())){
                window.removeLast();
            }
            window.addLast(i);
        }

        result.add(nums.get(window.peek()));

        for(int i=windowSize;i<nums.size();i++){

            while(!window.isEmpty() && nums.get(i)>=nums.get(window.peek())){
                window.removeLast();
            }

            if(!window.isEmpty() && window.peek() < i-windowSize){
                window.removeFirst();
            }

            window.addLast(i);
            result.add(nums.get(window.peek()));
        }
        return result;
    }

    public static List<Integer> findMaxSlidingWindow3(List<Integer>nums, int windowSize){
        List<Integer> result = new ArrayList<>();
        Deque<Integer>window = new ArrayDeque<>();
        if(windowSize>nums.size()){
            windowSize = nums.size();
        }
        for(int i=0;i<windowSize;i++){
            while(!window.isEmpty() && nums.get(i)>=nums.get(window.peekLast())){
                window.removeLast();
            }
            window.addLast(i);
        }

        result.add(nums.get(window.peek()));

        for(int i= windowSize;i<nums.size();i++){

            while(!window.isEmpty() && nums.get(i)>=nums.get(window.peekLast())){
                window.removeLast();
            }

            if(!window.isEmpty() && window.peek()<=i-windowSize){
                window.removeFirst();
            }

            window.add(i);
            result.add(nums.get(window.peek()));
        }

        return result;
    }

    public static List<Integer> findMaxSlidingWindow4(List<Integer>nums, int windowSize){
        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.size()-windowSize;i++){
            for(int j=i;j<windowSize+i;j++){
                if(nums.get(j)>max){
                    max=nums.get(j);
                }
            }
            result.add(max);
        }

        return result;
    }

    public static Deque<Integer> cleanup(Deque<Integer> dq,int i, int[] nums){
        while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
            dq.removeLast();
        }
        return dq;
    }
    public static int[] findMaxSlidingWindow5Opt(int[] nums, int w){
        // if size == 0
        if(nums.length==0){
            return new int[0];
        }

        if(w>nums.length){
            w=nums.length;
        }
        int[] output = new int[nums.length-w+1];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<w;i++){
           dq = cleanup(dq,i,nums);
           dq.addLast(i);
        }
        output[0] = dq.peekFirst();
        for(int i=w;i<nums.length-w+1;i++){
            cleanup(dq,i,nums);
            if(!dq.isEmpty() && dq.peekFirst()<=i-w){
                dq.removeFirst();
            }
            dq.add(i);
            output[i-w+1]=dq.peekFirst();
        }
        return output;
    }
    public static int[] findMaxSlidingWindow5(int[] nums, int w) {
        // your code will replace the placeholder return statement below

        int[] result = new int[nums.length-w+ 1];
        int max = Integer.MIN_VALUE;
        int k =0;
        for(int i=0;i<nums.length-w+1;i++){
            for(int j=i;j<w+i;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            result[k++] = max;
            max = Integer.MIN_VALUE;
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int[] nums = {4, 5, 6, 1, 2, 3};
        int[] result = findMaxSlidingWindow5(nums,1);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }

    }
}
