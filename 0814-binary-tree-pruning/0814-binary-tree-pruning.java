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

    //we are checking that like in 2nd example first we are checking if 1 left has no 1 in it so we delete that portion and simminarly in right we check after going to each node and checking and this solution is o^n2 as first we are checking left and right side of a tree and if we find a one then we are are going to each node in left and right to check if one is there or not and delete that node
    public TreeNode pruneTree(TreeNode root) {
        if(root==null){
            return null;
        }
        //this sol is o(n) as we are checking each node one time and either returing the node or null
        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);

        if(root.left==null && root.right==null && root.val==0){
            return null;
        }
        return root;
    }
    //this method is to find if 1 is present in left or right portion of a root
    public boolean isOnePresent(TreeNode root){
        if(root==null){
            return false;
        }
        if(root.val==1){
            return true;
        }
        return isOnePresent(root.left)|| isOnePresent(root.right);        
    }
}