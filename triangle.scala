object Solution {
    def minimumTotal(tri: List[List[Int]]): Int = {
        var n = tri.size;
        var triangle = tri.map(_.toArray).toArray

        if(n == 1)
            return triangle(0)(0);
        for(i <- (0 to n-2).reverse) {
            for(j <- 0 until triangle(i).length)
            triangle(i)(j) = triangle(i)(j) + Math.min(triangle(i+1)(j), triangle(i+1)(j+1));
        }
        return triangle(0)(0);
    }
}
