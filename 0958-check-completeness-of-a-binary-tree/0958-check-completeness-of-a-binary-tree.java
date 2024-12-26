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
    public boolean isCompleteTree(TreeNode root) {
        
        //this solution is using bfs or level order traversal
        Queue<TreeNode> qt=new LinkedList<>();
        boolean past=false;
        qt.offer(root);
        while(!qt.isEmpty()){
            TreeNode node=qt.poll();
            if(node==null){
                past=true;
                continue;
            }else if(past==true){
                return false;   
            }
                qt.offer(node.left);
                qt.offer(node.right);
 
        }
        return true;
        
    }
}