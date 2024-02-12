/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def maxDepth(root: TreeNode): Int = {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        var leftDepth = maxDepth(root.left);
        var rightDepth = maxDepth(root.right);

        1 + Math.max(leftDepth, rightDepth)
    }
}
