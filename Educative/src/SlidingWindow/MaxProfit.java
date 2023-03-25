package SlidingWindow;

public class MaxProfit {

    public static int maxProfit(int[] stockPrices) {


        // your code will replace this placeholder return statement
        int buy = 0, sell = 1, profit = 0, currProfit = 0;

        while (sell < stockPrices.length) {
            currProfit = stockPrices[sell] - stockPrices[buy];

            while (currProfit < 0 && buy < stockPrices.length) {
                buy++;
                currProfit=stockPrices[sell]-stockPrices[buy];
            }

            if (currProfit > profit) {
                profit = currProfit;
            }
            sell++;
        }
        return profit;

    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

}
