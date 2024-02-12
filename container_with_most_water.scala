object Solution {
    def maxArea(height: Array[Int]): Int = {
        var ans:Int = 0;
        var left:Int = 0;
        var right:Int = height.length-1;
        while(left<right) {
            ans = Math.max(ans, Math.min(height(left), height(right))*(right-left));
            if(height(left) < height(right)) left += 1; else right -= 1;
        }
        return ans;
    }
}
