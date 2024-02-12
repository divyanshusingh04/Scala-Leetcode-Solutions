object Solution {
    def threeSum(nums: Array[Int]): List[List[Int]] = {
        val sortedNums = nums.sorted
    var (firstIdx, secondIdx, thirdIdx) = (0, 1, 2)
    var res: List[List[Int]] = List()
    while (firstIdx < nums.length - 2) {
      if (firstIdx > 0 && sortedNums(firstIdx-1) == sortedNums(firstIdx)) {
        firstIdx += 1 }
      else {
        secondIdx = firstIdx + 1
        thirdIdx = nums.length - 1
        while (secondIdx < thirdIdx) {
          if ( firstIdx != secondIdx-1 && sortedNums(secondIdx-1) == sortedNums(secondIdx)) {secondIdx += 1} else {
            val sum = sortedNums(firstIdx) + sortedNums(secondIdx) + sortedNums(thirdIdx)
            if (sum > 0) {
              thirdIdx -= 1
            }
            else if (sum < 0) {
              secondIdx += 1
            }
            else {
              res =  res :+ List(sortedNums(firstIdx), sortedNums(secondIdx), sortedNums(thirdIdx))
              secondIdx += 1
              thirdIdx -= 1
            }}
        }
        firstIdx += 1
      }
    }
    res
    }
}
