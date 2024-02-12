object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var left = 0;
        var right = 1;
        while(right < nums.length) {
            if(nums(right) != nums(right-1)) {
                left += 1;
                nums(left) = nums(right);
            }
            right += 1;
        }
        left+1;

    }
}

