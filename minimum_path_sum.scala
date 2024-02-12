object Solution {
    def minPathSum(grid: Array[Array[Int]]): Int = {
        var (m,n) = (grid.length, grid(0).length);
        // var dp = Array.ofDim[Int](m,n);
        var dp = grid;
        for(row <- 0 until m) {
            for(col <- 0 until n) {
                dp(row)(col) += {

                    (row == 0, col == 0) match {
                        case (true, true) => 0;
                        case (false, false) => Math.min(grid(row)(col - 1), grid(row - 1)(col));
                        case (true, false) => grid(row)(col - 1);
                        case (false, true) => grid(row - 1)(col)
                    }
                }
                // print(dp(row)(col) + " ")
            }
            // println()
        }
        dp(m-1)(n-1)   
    }
}
