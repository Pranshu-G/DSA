package KWayMerge;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairs {

    public static List<List<Integer>> kSmallestPairs1(int[] list1, int[] list2, int target){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        List<List<Integer>> result = new ArrayList<>();
        int counter =0;
        for(int i=0;i<list1.length;i++){
            int sum = list2[0] + list1[i];
            pq.offer(new int[]{sum,i,0});
        }

        counter = 1;

        while(!pq.isEmpty() && counter<=target){
            int[] res = pq.poll();
            int j = res[2];
            result.add(new ArrayList<>(){{add(list1[res[1]]); add(list2[res[2]]);}});
            j++;
            if(j<list2.length){
                pq.add(new int[]{list1[res[1]]+list2[j],res[1],j});
            }
            counter++;
        }

        return result;
    }
    public static List<List<Integer>> kSmallestPairs(int[] list1, int[] list2, int target) {
        // Your code will replace this placeholder return statement
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        List<List<Integer>> list = new ArrayList<>();
        int l = 0;
        int i=0;
        for (i = 0; i < list1.length; i++) {
                int sum = list2[0] + list1[i];
                pq.offer(new int[]{sum, i, 0});
        }
        l=1;
        while (!pq.isEmpty() && l <= target) {
                int[] arr = pq.poll();
                int j = arr[2];
                list.add(new ArrayList<>() {
                    {
                        add(list1[arr[1]]);
                        add(list2[arr[2]]);
                    }
                });
                int nextElement = j +1;
                if(list2.length>nextElement){
                    List<Integer> list3 = new ArrayList<>();
                    int[] arr2 = new int[]{list1[arr[1]]+list2[j],arr[1],nextElement};
                    pq.add(arr2);
                }
                l++;
            }


        return list;
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 11, 20, 35, 300};
        int[] arr2 = new int[]{1, 2, 300};
        List<List<Integer>> res = kSmallestPairs1(arr1, arr2, 5);
        for (List i : res) {
            for (int k = 0; k < i.size(); k++) {
                System.out.print(i.get(k) + " ");

            }
            System.out.println();
        }
    }
}