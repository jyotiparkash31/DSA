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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        //when ever we need to remove nodes then we use to assign it to lrft and right nodes 
        root.left=removeLeafNodes(root.left,target);//assign value to left child  
        root.right=removeLeafNodes(root.right,target);//assign value to right child
        if(root.left==null && root.right==null && root.val==target){
            return null;
        }
        return root;
    }

}