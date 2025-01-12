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
    int maximum=0;
    public int diameterOfBinaryTree(TreeNode root) {
       if(root==null){
        return 0;
       }
       solve(root);
       return maximum;
    }
    public int solve(TreeNode root){
         if(root==null){
            return 0;
        }
        //we write l and r up before any thing when we need to go to end of the tree left and right and return something which needs to be followed by others upper nodes also and give result based on the below responses form  their child.
        int l=solve(root.left);
        int r=solve(root.right);

        maximum=Math.max(maximum,l+r);
        return Math.max(l,r)+1;
    }
}