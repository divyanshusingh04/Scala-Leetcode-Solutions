class MinStack() {

    var stk = scala.collection.mutable.Stack[(Int, Int)]();
    def push(`val`: Int) {
        stk.push((`val`, if(!stk.isEmpty) Math.min(`val`, stk.top._2) else `val`));
    }

    def pop() {
        stk.pop;
    }

    def top(): Int = {
        stk.top._1;
    }

    def getMin(): Int = {
        return stk.top._2;
    }   

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
