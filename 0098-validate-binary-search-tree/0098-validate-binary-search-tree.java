/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean fn(TreeNode root , Integer min, Integer max){
        if(root == null){
            return true;
        }
        if(min != null && root.val <= min || max!= null && root.val >= max){
            return false;
        }
        return fn(root.left, min ,root.val) && fn(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        return fn(root,null,null);
    }
}