package Array;
import java.util.*;

class Tuple<X, Y> {
    public X x;
    public Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}
public class BuyAndSellStock {
    public static Tuple<Integer, Integer> findBuySellStockPrices(int[] stockNums) {
        // TODO: Write - Your - Code
        Tuple<Integer, Integer> result = new Tuple<Integer, Integer>(-1, -1);
        int minBuy = 0, maxBuy=0;
        int MaxProfit = Integer.MIN_VALUE;
        for(int i=0;i<stockNums.length;i++){
            int tempminBuy = stockNums[i];
            for(int j=i+1;j< stockNums.length;j++){
                if(stockNums[j]-tempminBuy>MaxProfit){
                    MaxProfit = stockNums[j]-tempminBuy;
                    maxBuy = stockNums[j];
                    minBuy = tempminBuy;
                }
            }
        }
        minBuy = maxBuy-MaxProfit;
        result = new Tuple<>(minBuy,maxBuy);
        return result;
    }
    public static Tuple<Integer, Integer> findBuySellStockPricesOptimize(int[] stockNums) {
        // TODO: Write - Your - Code
        Tuple<Integer, Integer> result = new Tuple<Integer, Integer>(-1, -1);
        if (stockNums == null || stockNums.length<2) {
            return null;
        }

        int current_buy = stockNums[0];
        int global_sell = stockNums[1];
        int global_profit = global_sell-current_buy;
        int current_profit = Integer.MIN_VALUE;
        for(int i=1;i<stockNums.length;i++){
            current_profit = stockNums[i] - current_buy;
            if(current_profit>global_profit){
                global_profit = current_profit;
                global_sell =stockNums[i];
            }
            if(current_buy >stockNums[i]){
                current_buy = stockNums[i];
            }
        }
        result = new Tuple<>(global_sell-global_profit,global_sell);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        Tuple<Integer,Integer> ans = findBuySellStockPricesOptimize(arr);
        System.out.println(ans.x + " " + ans.y);
    }

}