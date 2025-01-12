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
    int ans=0;
    int maxDepth=-1;
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return 0;
        }
        solve(root,0);
        return ans;
    }

    public void solve(TreeNode root,int depth){
        if(root==null){
            return ;
        }
        if(depth>maxDepth){
            ans=root.val;
        }
        maxDepth=Math.max(maxDepth,depth);
        solve(root.left,depth+1);
        solve(root.right,depth+1);
    }

}