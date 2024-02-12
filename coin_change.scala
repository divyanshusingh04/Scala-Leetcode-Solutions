object Solution {
    def coinChange(coins: Array[Int], amount: Int): Int = {
        var dp = Array.fill(amount+1)(Int.MaxValue - 1);
        dp(0) = 0;
        for(i <- 0 until coins.length) {
            for(amt <- 1 to amount) {
                if(amt - coins(i) >= 0)
                    dp(amt) = dp(amt).min(1 + dp(amt - coins(i)))
            }
        }
        if (dp(amount) == Int.MaxValue-1) -1 else dp(amount) 
    }
}
