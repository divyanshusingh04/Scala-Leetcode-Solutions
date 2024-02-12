object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        var left = 0;
        var right = nums.length - 1;
        while(left < right) {
            var mid = left + (right - left) / 2;
            if(nums(mid) < target)
                left = mid + 1;
            else
                right = mid;
        }

        if(nums(left) < target) left + 1 else left;
    }
}
