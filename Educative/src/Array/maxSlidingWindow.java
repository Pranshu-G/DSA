package Array;

import java.util.*;

public class maxSlidingWindow {
    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        Deque<Integer> list = new ArrayDeque<>();
        int n = arr.length;

        if (n > 0){
            if(windowSize>n){
                windowSize=n;
            }
            for(int i=0;i<windowSize;i++){
                while(!list.isEmpty() && arr[i]>=arr[list.peekLast()]){
                    list.removeLast();
                }
                list.addLast(i);
            }

            for(int i=windowSize;i<n;i++){
                result.add(arr[list.peek()]);
                while(!list.isEmpty() && list.peek()<=i-windowSize){
                    list.removeFirst();
                }
                while(!list.isEmpty() && arr[i]>=arr[list.peekLast()]){
                    list.removeLast();
                }
                list.addLast(i);
            }
            result.add(arr[list.peek()]);
            return result;
        }
        else {
            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67};
        int windowSize = 2;
        ArrayDeque<Integer> result = findMaxSlidingWindow(nums,windowSize);
        for(int i: result){
            System.out.print(i + " ");
        }



    }
}
