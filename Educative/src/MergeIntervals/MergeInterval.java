package MergeIntervals;

import java.util.*;

public class MergeInterval {

    public static List <Interval> mergeIntervals(List <Interval> l) {
        // write your code here
        List<Interval> output = new ArrayList<>();
        output.add(l.get(0));
        int i =1,j=0;
        while(i <l.size()){
            if(l.get(i).start>= output.get(j).start && l.get(i).end<=output.get(j).end){
                i++;
            }

            else if(output.get(j).end>=l.get(i).start &&l.get(i).start >=output.get(j).start && output.get(j).end< l.get(i).end){
                output.get(j).end = l.get(i).end;
                i++;
            }
            else if(l.get(i).start>output.get(j).end){
                output.add(new Interval(l.get(i).start,l.get(i).end));
                i++;
                j++;

            }
            else{
                output.add(new Interval(l.get(i).start, l.get(i).end));
                i++;
                j++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<>();

        input.add(new Interval(1,5));
        input.add(new Interval(4,6));
        input.add(new Interval(6,8));
        input.add(new Interval(11,15));
        List<Interval> output = new ArrayList<>();
        output = mergeIntervals(input);
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).start + " " + output.get(i).end);
        }


    }
}
