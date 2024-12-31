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
    //int maximum=-1;
    public int maxAncestorDiff(TreeNode root) {
       if(root==null){
        return 0;
       }
        return findMaxDiff(root,root.val,root.val);
    }
    //here we are finding max and min in every branch and at the end of a branch we are returning the diff and we are comparing the lef each branch diff and taking the max and returning
public int findMaxDiff(TreeNode node,int min,int max){
    if(node==null){
        return Math.abs(max-min);
    }

    min=Math.min(min,node.val);
    max=Math.max(max,node.val);

    int l=findMaxDiff(node.left,min,max);
    int r=findMaxDiff(node.right,min,max);

    return Math.max(l,r);
}

    //This is a brute force solution in which we are taking one node at a time and comparing the diff with the beow child form R and L and again doing down to its child left and Right and doing the same for that child 
    // public void maxDiff(TreeNode node){
    //     if(node==null){
    //         return;
    //     }
    //     max(node,node.left);
    //     max(node,node.right);

    //     maxDiff(node.left);
    //     maxDiff(node.right);
    // }
    // public void max(TreeNode root,TreeNode child){
    //     if(root==null || child==null){
    //         return ;
    //     }
    //     maximum=Math.max(maximum,Math.abs(root.val-child.val));
         
    //     max(root,child.left);
    //     max(root,child.right);
    // }
}