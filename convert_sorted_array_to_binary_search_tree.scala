/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def sortedArrayToBST(nums: Array[Int]): TreeNode = {
        solve(nums, 0, nums.size - 1);
    }
    def solve(nums: Array[Int], left: Int, right: Int): TreeNode = {
        if (left > right)
            return null;
        var mid = left + (right - left) / 2;
        val obj = new TreeNode(nums(mid));
        obj.left = solve(nums, left, mid - 1);
        obj.right = solve(nums, mid + 1, right);
        obj
    }
}
