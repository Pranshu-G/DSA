package Subsets;

import java.lang.reflect.InaccessibleObjectException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindSubsets {

    static int getBit(int num, int bit) {
        // shifts the first operand the specified number of bits to the left
        int temp = (1 << bit);

        // if binary number and current subset count are equal,
        // return 1 else return 0
        temp = temp & num;
        if (temp == 0) {
            return 0;
        }
        return 1;
    }

    static List<HashSet<Integer>> findAllSubsets(List<Integer> v) {
        List<HashSet<Integer>> setsList = new ArrayList<HashSet<Integer>>();
        if (!v.isEmpty()) {
            // finds number of subsets by taking power of length of input array
            int subsetsCount = (int) (Math.pow((double) 2, (double) v.size()));

            for (int i = 0; i < subsetsCount; ++i) {
                // Set is created to store each subset
                HashSet<Integer> set = new HashSet<Integer>();
                for (int j = 0; j < v.size(); ++j) {
                    // if a specific bit is 1, chooses that number from the original set
                    // and add it to the current subset
                    if (getBit(i, j) == 1) {
                        int x = v.get(j);
                        set.add(x);

                    }

                }
                System.out.println("\tCurrent generated subset: "+ set.toString());
                // all subsets are now pushed back in the hah set list
                setsList.add(set);
                System.out.println("\tSubsets list: "+ setsList.toString()+"\n");
            }
        } else {
            HashSet<Integer> emptySet = new HashSet<Integer>();
            setsList.add(emptySet);
        }
        return setsList;
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(1,2,3,4));
        List<HashSet<Integer>> ans = findAllSubsets(l);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).toString() + " ");
            }

            System.out.println();
        }
    }
}
