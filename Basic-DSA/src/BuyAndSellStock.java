import java.util.ArrayList;
import java.util.List;

public class BuyAndSellStock {

    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.

      int minBuy =Integer.MAX_VALUE;
      int maxProfit = 0;

      for(int i : prices){
          if(minBuy>i){
              minBuy = i;
          }
          if(maxProfit<= i-minBuy){
              maxProfit = i - minBuy;
          }
      }

      return maxProfit;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(List.of(2,100,150,120));
        int ans = maximumProfit(arr);
        System.out.println(ans);

    }
}
