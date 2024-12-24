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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        if(root==null)return list;
        dfs(root,1,list);
        return list;
    }
    
    //this is the dfs approch for this solution using the preorder traversal root->right->left
//here using the level to fill the list it was the main thought and going to right was because we have to show write side view
    public void dfs(TreeNode node,int level,List<Integer> list){
        if(node==null){
            return;
        }
        if(list.size()<level){
            list.add(node.val);
        }
        dfs(node.right,level+1,list);
        dfs(node.left,level+1,list);
    }
}