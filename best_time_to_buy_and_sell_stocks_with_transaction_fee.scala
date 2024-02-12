object Solution {
    def maxProfit(prices: Array[Int], fee: Int): Int = {
        var dp = Array.ofDim[Int](prices.size + 1, 2);
        solve(0, 1, dp, prices, fee);
    }

    def solve(idx:Int, canBuy:Int, dp:Array[Array[Int]], prices:Array[Int], fee:Int): Int = {
        if(idx == prices.length)
            return 0;
        
        if(dp(idx)(canBuy) != 0)
            return dp(idx)(canBuy);
        
        val take: Int = solve(idx + 1, canBuy^1, dp, prices, fee) + 
                        (if (canBuy == 1) -prices(idx) else prices(idx) - fee);
        val notTake: Int = solve(idx + 1, canBuy, dp, prices, fee);

        dp(idx)(canBuy) = Math.max(take, notTake);
        return dp(idx)(canBuy)
    }
}
