package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {

    public static ArrayList<ArrayList<Integer>> list= new ArrayList<>();


    void helper(ArrayList<Integer> l, ArrayList<Integer> temp, int index){
        if(index == l.size()){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(l.get(index));
        helper(l,temp,index+1);
        temp.remove(temp.size()-1);
        helper(l,temp,index+1);

    }
     ArrayList<ArrayList<Integer>> ArraySubsets(ArrayList<Integer> l){
        ArrayList<Integer> temp = new ArrayList<>();
        helper(l,temp,0);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(List.of(1, 2, 3));
        int j = 0;
        SubsetsOfArray s = new SubsetsOfArray();
        s.ArraySubsets(l);
//        ArrayList<Integer> i = new ArrayList<>();
//        for(ArrayList<Integer> i: list){
//            for(int k: i){
//                System.out.print(k + " ");
//            }
//
//            System.out.println();
//        }
//    }

        for(int i=0;i<list.size();i++){
            for(int k=0;k<list.get(i).size();k++){
                System.out.print(list.get(i).get(k) + " ");
            }
            System.out.println();
        }
    }

}
