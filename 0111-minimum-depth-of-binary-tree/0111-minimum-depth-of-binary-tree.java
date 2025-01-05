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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        //if bot the left and right child is null return 1 end of one branch;
        if(root.left==null && root.right==null){
            return 1;
        }
    // we check left branch and return the left branch depth and same with right branch
        int l=root.left!=null?minDepth(root.left):Integer.MAX_VALUE;
        int r=root.right!=null?minDepth(root.right):Integer.MAX_VALUE;
        //finally we return min of both right and left branch
        return 1+ Math.min(l,r);

    }
}