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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        //this code is level order traversal and bfs way of traversing tree we use queue for iterative way
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> curr= new ArrayList<>();
            while(size>0){
                TreeNode node=queue.poll();
                curr.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                     queue.offer(node.right);
                }
                size--;
            }
            list.add(curr);
            
        }
     return list;
    }
}