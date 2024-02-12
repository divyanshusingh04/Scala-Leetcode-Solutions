/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * trait NestedInteger {
 *
 *   // Return true if this NestedInteger holds a single integer, rather than a nested list.
 *   def isInteger: Boolean
 *
 *   // Return the single integer that this NestedInteger holds, if it holds a single integer.
 *   def getInteger: Int
 *
 *   // Set this NestedInteger to hold a single integer.
 *   def setInteger(i: Int): Unit
 *
 *   // Return the nested list that this NestedInteger holds, if it holds a nested list.
 *   def getList: Array[NestedInteger]
 *
 *   // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *   def add(ni: NestedInteger): Unit
 * }
 */

class NestedIterator(_nestedList: List[NestedInteger]) {
    var idx = -1;
    var data = Array[Int]();

    for(element <- _nestedList) {
        if(element.isInteger)
            data :+= element.getInteger
        else
            data ++= recur(element.getList)
    }
    
    def recur(data:Array[NestedInteger]):Array[Int] = {
        var ret = Array[Int]();
        for(element <- data) {
            if(element.isInteger)
                ret :+= element.getInteger;
            else
                ret ++= recur(element.getList);
        }
        ret
    }
   
    def next(): Int = {
        idx += 1;
        return data(idx);        
    }
    
    def hasNext(): Boolean = {
        idx + 1 != data.size
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * var obj = new NestedIterator(nestedList)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */
