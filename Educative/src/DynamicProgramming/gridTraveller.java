package DynamicProgramming;

import java.math.BigInteger;
import java.util.HashMap;

public class gridTraveller {

    public static int gridTraveller(int m, int n){

        if(m==1 && n==1)
            return 1;
        if(m==0 || n==0)
            return 0;

        return gridTraveller(m-1,n) + gridTraveller(m,n-1);
    }

    public static int gridTravellerMemo(int m, int n, HashMap<String,Integer> map){
        String key = String.valueOf(m) + ',' + String.valueOf(n);

        if(map.containsKey(key)){
            return map.get(key);
        }
        if(m==1 && n==1)
            return 1;
        if(m==0 || n==0)
            return 0;

        map.put(key, gridTravellerMemo(m-1,n,map) + gridTravellerMemo(m,n-1,map));
        return map.get(key);
    }
    public static BigInteger gridTravellerMemoBig(int m, int n, HashMap<String, BigInteger> map){
        String key = String.valueOf(m) + ',' + String.valueOf(n);

        if(map.containsKey(key)){
            return map.get(key);
        }
        if(m==1 && n==1)
            return BigInteger.valueOf(1);
        if(m==0 || n==0)
            return BigInteger.valueOf(0);

        map.put(key, gridTravellerMemoBig(m-1,n,map).add(gridTravellerMemoBig(m,n-1,map)));
        return map.get(key);
    }
    public static void main(String[] args) {


        System.out.println(gridTravellerMemo(3,3, new HashMap<>()));
        System.out.println(gridTravellerMemo(1,1, new HashMap<>()));
        System.out.println(gridTravellerMemo(4,3,new HashMap<>()));
        System.out.println(gridTraveller(4,3));
        System.out.println(gridTravellerMemoBig(18,18,new HashMap<>()));
        System.out.println(gridTravellerMemoBig(4,3,new HashMap<>()));
    }
}
