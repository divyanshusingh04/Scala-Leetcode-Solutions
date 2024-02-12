object Solution {
    def minDistance(word1: String, word2: String): Int = {
        var dp = Array.fill(word1.length)(Array.fill(word2.length)(0));
        
        def solve(idx1:Int, idx2:Int): Int = {
            if(idx1 == word1.length || idx2 == word2.length) 
                return if(idx1 == word1.length) word2.length - idx2 else word1.length - idx1;
            
            if(dp(idx1)(idx2) != 0)
                return dp(idx1)(idx2);
            
            if(word1.charAt(idx1) == word2.charAt(idx2)) {
                dp(idx1)(idx2) = solve(idx1+1, idx2+1);
                return dp(idx1)(idx2);
            }
            
            var (insert, dlt, replace) = (Int.MaxValue, Int.MaxValue, Int.MaxValue);
            insert = 1 + solve(idx1, idx2 + 1);
            dlt = 1 + solve(idx1 + 1, idx2);
            replace = 1 + solve(idx1 + 1, idx2 + 1);

            dp(idx1)(idx2) = insert min (dlt min replace);
            return dp(idx1)(idx2);
        }
        solve(0,0);
    }
}
