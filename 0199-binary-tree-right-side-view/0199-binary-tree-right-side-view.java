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
    //      List<Integer>ans=new ArrayList<>();
    //     Queue<TreeNode> q=new LinkedList<>();//using queue as it is bfs traversal
    //     if(root==null)return ans;
    //     q.offer(root);
    //     while(!q.isEmpty()){
    //         int size=q.size();//size for running loop to add the child   
    //         for(int i=0;i<size;i++){
    //             TreeNode node=q.poll();//taking out the node from the queue
    //             if(i==size-1){
    //                 ans.add(node.val);
    //             }
    //             if(node.left!=null){//taking the left child in the queue
    //                 q.offer(node.left);
    //             }
    //              if(node.right!=null){//taking the right child in the queue
    //                 q.offer(node.right);
    //             }
    //         }
    //    }
    //     return ans;
        
        List<Integer> list=new ArrayList<>();
        help(root,list,0);
        return list;
        
    }
    public void help(TreeNode node,List<Integer> list,int level){
        if(node==null)return ;
        
        if(level==list.size()){
            list.add(node.val);
        }
        help(node.right,list,level+1);
        help(node.left,list,level+1);
 
    }
}