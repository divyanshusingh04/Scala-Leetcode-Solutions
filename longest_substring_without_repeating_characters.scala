object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
        var count = scala.collection.mutable.Map[Char,Int]().withDefaultValue(0);
        var left = -1;
        var ans = 0;
        for(right <- 0 until s.length) {
            count(s.charAt(right)) += 1;
            while(count(s.charAt(right)) == 2) {
                left += 1;
                count(s.charAt(left)) -= 1;
            }
            ans = Math.max(ans, right - left);
        }
        ans
    }
}
