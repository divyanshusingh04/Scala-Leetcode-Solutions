object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
        var count = scala.collection.mutable.HashMap[Int, Int]().withDefaultValue(0);
        var ans = 0;
        for(num <- nums) {
            if(!count.contains(num)) {

                var leftVal = if(count(num-1) != 0) count(num-1) else 0;
                var rightVal = if(count(num+1) != 0) count(num+1) else 0;

                count(num) = leftVal + rightVal + 1;
                ans = Math.max(ans, leftVal + rightVal + 1);

                println(num - leftVal + "=" + (leftVal+rightVal+1)) 
                println(num + rightVal + "=" + (leftVal+rightVal+1)) 
                println()

                count(num - leftVal) = leftVal + rightVal + 1;
                count(num + rightVal) = leftVal + rightVal + 1;
            }
        }
        ans;
    }
}
