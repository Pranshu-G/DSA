import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class codingInterview {
//
//
//    public static void func(int[] arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i: arr){
//            if(map.containsKey(i)){
//                int val = map.get(i);
//                map.put(i,val+1);
//            }
//            else{
//                map.put(i,1);
//            }
//        }
//        System.out.println(map.entrySet());
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//            for(Entry<Integer,Integer> e : map.entrySet()){
//                ArrayList<Integer> a = new ArrayList<>();
//                a.add(e.getKey());
//                a.add(e.getValue());
//                list.add(a);
//            }
////        Collections.sort(list, new Comparator<ArrayList<Integer>>() {
////            @Override
////            public int compare(ArrayList<Integer> p1, ArrayList<Integer> p2) {
////                if(p1.get(1)>p2.get(1)){
////                    return p1.get(1);
////                }
////                else if(p1.get(1)<p2.get(1)){
////                    return p2.get(1);
////                }
////                else{
////                    if(p1.get(0)>p2.get(0)){
////                        return p1;
////                    }
////                    else {
////                        return p2;
////                    }
////                }
////            }
////        });
//    }
//
//    public static int findEle(ArrayList<Integer> list, int element,int start){
//        int x = helper(list,element,50);
//        if(x>=element){
//            return binarySearch(list,start,x);
//        }
//        else{
//            findEle(list,element,x);
//        }
//    }
//
//    public static int helper(ArrayList<Integer> list, int element, int index){
//        if(list.get(index)>element){
//            return index;
//        }
//        return element-index;
//    }
//    public ArrayList<Integer> compareTo(ArrayList<Integer>p1,ArrayList<Integer> p2){
//        if(p1.get(1)>p2.get(1)){
//            return p1;
//        }
//        else if(p1.get(1)<p2.get(1)){
//            return p2;
//        }
//        else{
//            if(p1.get(0)>p2.get(0)){
//                return p1;
//            }
//            else {
//                return p2;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,1,3,2,3,4};
//        func(arr);
//    }

}
