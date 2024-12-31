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
    long sum=0,product=0;
    public int maxProduct(TreeNode root) {
        if(root==null){
            return 0;
        }
        sum=sumOfTree(root);
        
        sumOfTree(root);
        return (int)(product % (int)(1e9 + 7));

    }
    
    // public int productBt(TreeNode root,int sum){
    //     if(root==null){
    //         return 0;
    //     }
    //     subTreeSum=root.val+productBt(root.left,sum)+productBt(root.right,sum);
    //     product=Math.max(product,(sum-subTreeSum)*subTreeSum);

    //     return product;
    // }
    long subTreeSum=0;
    public long sumOfTree(TreeNode root){
     if(root==null){
        return 0;
     }
     subTreeSum=root.val+sumOfTree(root.left)+sumOfTree(root.right);
     product=Math.max(product,(sum-subTreeSum)*subTreeSum);
     return subTreeSum;
    }
}