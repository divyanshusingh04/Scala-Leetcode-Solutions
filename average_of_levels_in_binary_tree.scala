/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def averageOfLevels(root: TreeNode): Array[Double] = {
        val q = scala.collection.mutable.Queue[TreeNode]();
        val ans = scala.collection.mutable.ArrayBuffer[Double]();
        q += root;
        while(!q.isEmpty) {
            val noOfLevelNodes = q.size;
            
            var noOfIterations = noOfLevelNodes;
            var sum: Double = 0;
            while(noOfIterations != 0) {
                var currNode = q.dequeue;
                if (currNode != null) {
                    sum += currNode.value;
                    if(currNode.left != null)
                        q += currNode.left;
                    if(currNode.right != null)
                        q += currNode.right;
                }
                
                noOfIterations -= 1;
            }
            val levelAvg: Double = sum / noOfLevelNodes;
            ans += levelAvg;
        }
        // ans.foreach(println)
        ans.toArray;
    }
}
