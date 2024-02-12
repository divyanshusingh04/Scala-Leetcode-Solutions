object Solution {
    def climbStairs(n: Int): Int = {
        if(n <= 2)
            return n;
        
        var first:Int = 1;
        var second:Int = 2;
        var ans:Int = 0;
        for(i <- (3 to n)) {
            ans = first + second;
            first = second;
            second = ans;
        }
        return ans;
    }
}
