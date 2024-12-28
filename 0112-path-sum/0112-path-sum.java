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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null && targetSum-root.val==0){
            return true;
        }     
        //mainly we use this left||right when we have boolean value to return and before doing this er write all the condition for cheking the same
       return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);      
    }
}