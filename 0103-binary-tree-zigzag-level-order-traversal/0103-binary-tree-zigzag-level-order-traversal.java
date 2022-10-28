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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans=new ArrayList<>();
       boolean leftRight=true;
        Queue<TreeNode> q=new LinkedList<>();//using queue as it is bfs traversal
        if(root==null)return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();//size for running loop to add the child
            List<Integer> curr=new LinkedList<>();//for storing current level node
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();//taking out the node from the queue
                if(leftRight==true){
                  curr.add(node.val);  
                }else{
                  curr.add(0,node.val);  
                }
                
                if(node.left!=null){//taking the left child in the queue
                    q.offer(node.left);
                }
                 if(node.right!=null){//taking the right child in the queue
                    q.offer(node.right);
                }
            }
            ans.add(curr);
            leftRight=!leftRight;
        }
        return ans;
    }
}