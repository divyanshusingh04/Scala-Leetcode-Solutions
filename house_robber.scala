object Solution {
    def rob(nums: Array[Int]): Int = {
        if(nums.size == 1)
            return nums(0);
        if(nums.size == 2)
            return Math.max(nums(0), nums(1));
        var dp = Array.fill(nums.size)(0);
        dp(0) = nums(0);
        dp(1) = nums(1) max nums(0);

        for(i <- 2 until nums.size) {
            dp(i) = Math.max(nums(i) + dp(i-2), dp(i-1));
        }
        return dp(nums.size - 1);
    }
}
