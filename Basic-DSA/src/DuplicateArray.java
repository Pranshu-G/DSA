import java.sql.Array;
import java.util.*;


public class DuplicateArray {

    public static int findDuplicate(ArrayList<Integer> arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                return arr.get(i);
            }
            else{
                map.put(arr.get(i),1);
            }
        }
        return 1;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,2,4));
        System.out.println(findDuplicate(arr));
    }
}