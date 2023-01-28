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


    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> result = findMaxSlidingWindow2(list,2);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }
}
