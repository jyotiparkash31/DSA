/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


// We will be performing a dfs post-order on the given tree .
// Post order traversal have some unique property i.e. for some node of a tree , we will analyze its left subtree then its right subtree and then the node itself
// So post-order guarantees that left and right subtrees are already analyzed which is helpful in solving this problem

// Possible cases:
// If p and q are in different subtrees of the node.
// If either of p and q is equal to the node.
// If p and q are in the same subtree of the current node.

class Solution {
    //The first node whose left and right both are not null will be the LCS.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode leftNode=lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode=lowestCommonAncestor(root.right,p,q);
        
        if(leftNode!=null && rightNode!=null){
            return root;
        }
       
         return leftNode != null ? leftNode : rightNode;
        
    }
}