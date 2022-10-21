import java.util.HashMap;

public class SingleNumber {

    public static int occursOnce(int[] a, int n) {
        // Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        for(int j : map.keySet()){
            if(map.get(j)==1){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};
        int result = occursOnce(arr,7);
        System.out.println(result);
    }

}
