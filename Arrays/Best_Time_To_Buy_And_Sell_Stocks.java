public class Best_Time_To_Buy_And_Sell_Stocks {

    public static int buyAndSellStocks(int prices[]){
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            // if(minBuyPrice < prices[i]){ //profit
            //     int profit = prices[i] - minBuyPrice;
            //     maxProfit = Math.max(maxProfit,profit);
            // }else{
            //     minBuyPrice = prices[i];
            // }

            minBuyPrice = Math.min(minBuyPrice,prices[i]);
            int profit = prices[i] - minBuyPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String Args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        // int prices[] = {7, 6, 5, 4, 2, 1};
        System.out.print("The Max profit from the stocks is:"+buyAndSellStocks(prices));
    }
}
