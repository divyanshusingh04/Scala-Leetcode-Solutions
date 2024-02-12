object Solution {
    def search(nums: Array[Int], target: Int): Int = {
        var left = 0;
        var right = nums.size - 1;
        while(left < right) {
            var mid = left + ( right - left ) / 2;
            var leftVal = nums(left);
            var midVal = nums(mid);
            var rightVal = nums(right);

            if(leftVal <= midVal) {
                if(leftVal <= target && target <= midVal) {
                    right = mid;
                } else 
                    left = mid + 1;
            } else {
                if(midVal < target && target <= rightVal) {
                    left = mid + 1;
                } else 
                    right = mid;
            }
        }
        if(nums(left) == target) left else -1;
    }
}
