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
    public int minDepth(TreeNode root) {
        //dfs code
        if(root==null)return 0;
        // if(root.left==null && root.right==null)return 1;
        // if(root.left==null)return 1+ minDepth(root.right);
        // if(root.right==null)return 1+ minDepth(root.left);
        // return 1+ Math.min(minDepth(root.left),minDepth(root.right));
        
        //bfs code
        
        Queue<TreeNode> q=new LinkedList<>();//using queue as it is bfs traversal
        int level=1;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();//size for running loop to add the child
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();//taking out the node from the queue
                if(node.left==null && node.right==null)return level;
                if(node.left!=null){//taking the left child in the queue
                    q.offer(node.left);
                }
                 if(node.right!=null){//taking the right child in the queue
                    q.offer(node.right);
                }
            }
            level++;
            
        }
       return level;
    }
}