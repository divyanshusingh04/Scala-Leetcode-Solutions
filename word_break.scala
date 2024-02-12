object Solution {
    def wordBreak(s: String, wordDict: List[String]): Boolean = {
        val dict = wordDict.toSet;
        var dp = new Array[Int](s.length+1);
        dp(0) = 1;

        for(lastIdx <- 1 to s.length) {
            var startIdx = lastIdx-1;
            while(startIdx >= 0) {
                if(dp(startIdx) == 1) {
                    val currWord = s.slice(startIdx, lastIdx);
                    if(dict.contains(currWord)) {
                        dp(lastIdx) = 1;
                        startIdx = -1;
                    }
                }
                startIdx -= 1;
            }
        }

        if(dp(s.length) == 1) true else false;
    }
}
