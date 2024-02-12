/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def isSymmetric(root: TreeNode): Boolean = {
        solve(root.left, root.right);
    }
    def solve(left: TreeNode, right: TreeNode): Boolean = {
        if(left == null && right == null)
            return true
        if((left != null && right == null) || (left == null && right != null))
            return false
        if(left.value != right.value)
            return false
        return solve(left.left, right.right) && solve(left.right, right.left);

    }
}
