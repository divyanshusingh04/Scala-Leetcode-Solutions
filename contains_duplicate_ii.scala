object Solution {
    def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
        
        var position = scala.collection.mutable.HashMap[Int, Int]();
        for(idx <- 0 until nums.length) {
            if(position.contains(nums(idx)))
                if(idx - position(nums(idx)) <= k)
                    return true;
                position(nums(idx)) = idx;
        }
        false;
    }
}
