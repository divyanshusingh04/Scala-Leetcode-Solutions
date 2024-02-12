object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var currProfit = 0;
        var lowestPrice = prices(0);
        for(currPrice <- prices) {
            if(currPrice > lowestPrice)
                currProfit = currProfit.max(currPrice - lowestPrice);
            else
                lowestPrice = currPrice;
        }
        currProfit;
    }
}
