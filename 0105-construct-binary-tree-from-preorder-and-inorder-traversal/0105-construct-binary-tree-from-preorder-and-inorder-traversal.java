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
// The basic idea is here:
// Say we have 2 arrays, PRE and IN.
// Preorder traversing implies that PRE[0] is the root node.
// Then we can find this PRE[0] in IN, say it's IN[5].
// Now we know that IN[5] is root, so we know that IN[0] - IN[4] is on the left side, IN[6] to the end is on the right side.
// Recursively doing this on subarrays, we can build a tree out of it :)
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
        //here preidx+i-start+1 means (i - Start) is the size of root's left subtree.
        return root;
    }
}