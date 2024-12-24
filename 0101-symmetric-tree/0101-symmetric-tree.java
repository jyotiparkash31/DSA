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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
       return help(root.left,root.right);
    }
    public boolean help(TreeNode leftNode,TreeNode rightNode){
        if(leftNode==null || rightNode==null )return (leftNode==rightNode);
        if(leftNode.val!=rightNode.val){
            return false;
        }
      return help(leftNode.right,rightNode.left) &&  help(leftNode.left,rightNode.right);
    }
}