object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        var (idx1, idx2, finalidx) = (m-1, n-1, nums1.length-1);
        while(finalidx >= 0) {
            // println(idx1 + " " + idx2 + " " + finalidx)
            if(idx1 < 0) {
                nums1(finalidx) = nums2(idx2);
                idx2 -=1;
            } else if(idx2 < 0) {
                nums1(finalidx) = nums1(idx1);
                idx1 -= 1;
            } else if(nums1(idx1) < nums2(idx2)) {
                nums1(finalidx) = nums2(idx2);
                idx2 -=1;
            } else {
                nums1(finalidx) = nums1(idx1);
                idx1 -=1;
            }

            finalidx -= 1;
        }
        
         
    }
}
