/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
        if(root == null)
            return false;
        if(root.value == targetSum && root.left == null && root.right == null)
            return true;
        var flag = false;
        if(root.left != null)
            flag |= hasPathSum(root.left, targetSum-root.value);
        if(root.right != null)
            flag |= hasPathSum(root.right, targetSum-root.value);
        flag;
    }
}
