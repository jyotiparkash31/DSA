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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,inorder,0,n-1,0);
        
    }
    public TreeNode helper(int[] preorder, int[] inorder,int start,int end,int preidx){
        if(start>end)
            return null;
        
        int nodeVal=preorder[preidx];
        int i=start;
        for(;i<=end;i++){
            if(inorder[i]==nodeVal){
                break;
            }
        }
        
        TreeNode root=new TreeNode(nodeVal);
        root.left=helper(preorder,inorder,start,i-1,preidx+1);
        root.right=helper(preorder,inorder,i+1,end,preidx+i-start+1);
        
        return root;
    }
}