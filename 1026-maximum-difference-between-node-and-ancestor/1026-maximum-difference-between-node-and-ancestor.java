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
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)return 0;
        return solve(root,root.val,100000);
    }
    public int solve(TreeNode node,int currMax,int currMin){
        if(node==null){
            return currMax-currMin;
        }
        //the code will first return maxdiff from each leftsub tree and then right we have to return  overall maxdiff of the tree
        currMax=Math.max(currMax,node.val);
        currMin=Math.min(currMin,node.val);
        int left=solve(node.left,currMax,currMin);
        int right=solve(node.right,currMax,currMin);
        
        return Math.max(left,right);
    }
}