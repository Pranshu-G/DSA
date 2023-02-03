package MergeIntervals;

import java.util.*;
public class InsertInterval {


    public static List <Interval> insertInterval(List <Interval> existingIntervals, Interval newInterval) {
        List <Interval> output = new ArrayList <Interval> ();
        int new_first = newInterval.start;
        int insertSpot=0;

        for(int i=0;i<existingIntervals.size();i++){
            if(existingIntervals.get(i).start>new_first){
                insertSpot = i;
                break;
            }
            else{
                insertSpot = existingIntervals.size();
            }
        }

        for(int i=0;i<insertSpot;i++){
            output.add(existingIntervals.get(i));
        }
        output.add(newInterval);
        List<Interval> temp = mergeIntervals(output);

        for(int i=insertSpot;i<existingIntervals.size();i++){
            mergeIntervalSingle(temp,existingIntervals.get(i));
        }
        // Write your code here
        return temp;
    }
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

    public static List <Interval> mergeIntervalSingle(List <Interval> existingIntervals, Interval newInterval){

        int existingFirstEle = existingIntervals.get(existingIntervals.size()-1).start;
        int existingLastEle = existingIntervals.get(existingIntervals.size()-1).end;
        int newFirstEle = newInterval.start;
        int newLastEle = newInterval.end;

        if(existingLastEle<newLastEle && existingLastEle>=newFirstEle){
            existingIntervals.get(existingIntervals.size()-1).end = newLastEle;
        }
        else if(existingLastEle>newLastEle){
            return existingIntervals;
        }
        else if(existingLastEle<newFirstEle){
            existingIntervals.add(newInterval);
        }
        return existingIntervals;
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<>();

        input.add(new Interval(1, 2));
        input.add(new Interval(3, 4));
        input.add(new Interval(5, 8));
        input.add(new Interval(9, 15));

        Interval l = new Interval(2, 5);
        List<Interval> output = insertInterval(input,l);
        for(Interval i: output){
            System.out.println(i.start + " " + i.end);
        }
    }
}