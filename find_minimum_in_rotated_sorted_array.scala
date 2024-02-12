object Solution {
    def findMin(nums: Array[Int]): Int = {
        var low = 0;
        var high = nums.size-1;
        while(low < high) {
            var mid = low + (high - low) /2;
            if(nums(low) <= nums(mid) && nums(mid) >= nums(high))
                low = mid + 1;
            else    
                high = mid;
        }
        if(low == 0)
            nums(0)
        nums(low)
    }
}
