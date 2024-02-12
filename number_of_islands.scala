object Solution {
    def numIslands(grid: Array[Array[Char]]): Int = {
        var m = grid.length;
        var n = grid(0).length;

        var ans = 0;

        for(row <- 0 until m) {
            for(col <- 0 until n) {
                if(grid(row)(col) == '1') {
                    var q = scala.collection.mutable.Queue[(Int,Int)]();
                    q.enqueue((row, col));
                    grid(row)(col) = '2';

                    while(!q.isEmpty) {
                        var (currRow, currCol) = q.dequeue;
                        if(currRow-1 >= 0 && grid(currRow-1)(currCol) == '1') {
                            q.enqueue((currRow-1, currCol));
                            grid(currRow-1)(currCol) = '2';
                        }
                        if(currCol-1 >= 0 && grid(currRow)(currCol-1) == '1') {
                            q.enqueue((currRow, currCol-1));
                            grid(currRow)(currCol-1) = '2';
                        }
                        if(currRow+1 < m && grid(currRow+1)(currCol) == '1') {
                            q.enqueue((currRow+1, currCol));
                            grid(currRow+1)(currCol) = '2';
                        }
                        if(currCol+1 < n && grid(currRow)(currCol+1) == '1') {
                            q.enqueue((currRow, currCol+1));
                            grid(currRow)(currCol+1) = '2';
                        }
                    }
                    ans += 1;
                }
            }
        }
        ans;
    }
}
