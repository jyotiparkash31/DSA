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
    public int countNodes(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        int lh=leftHeight(root);
        int rh=rightHeight(root);

        if(rh==lh){
            return ((int)Math.pow(2,lh)-1);//uding the property of binary tree to fing the height og a complete bt
        }
        return 1+countNodes(root.left)+countNodes(root.right);
        //this solution is of o(n)
        // if(root==null){
        //     return 0;
        // }
        // //if the node is last node or not if yes return 1
        // if(root.left==null && root.right==null){
        //     return 1;
        // }
        // //going both right and left ie. dfs
        // return 1+countNodes(root.left)+countNodes(root.right);
    }

//finding thee left height
    public int leftHeight(TreeNode root){
        TreeNode temp=root;
        int lh=0;

        while(temp!=null){
            temp=temp.left;
            lh++;
        }
        return lh;
    }
//finding the right height
     public int rightHeight(TreeNode root){
        TreeNode temp=root;
        int rh=0;

        while(temp!=null){
            temp=temp.right;
            rh++;
        }
        return rh;
    }
}