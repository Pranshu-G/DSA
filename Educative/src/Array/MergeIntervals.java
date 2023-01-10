package Array;

import java.util.ArrayList;
import java.util.Arrays;

class Interval {
    public int first;
    public int second;

    public Interval(int x, int y) {
        this.first = x;
        this.second = y;
    }
}
public class MergeIntervals {
    static ArrayList<Interval> mergeIntervals(ArrayList<Interval> v) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        for(int i=0;i<v.size();i++){
            for(int j=i+1;j<v.size();j++){
                if(v.get(i).second>v.get(j).first){
                    if(v.get(i).second>v.get(j).second){
                        result.add(new Interval(v.get(i).first,v.get(i).second));
                    }
                    else{
                        result.add(new Interval(v.get(i).first,v.get(j).second));
                    }
                }
            }

        }
        // write your code here
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Interval> list= new ArrayList<>(Arrays.asList(new Interval(1,3),new Interval(2,7),new Interval(5,10)));
        ArrayList<Interval> ans = mergeIntervals(list);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i).first + " " + ans.get(i).second);
        }
    }
}
