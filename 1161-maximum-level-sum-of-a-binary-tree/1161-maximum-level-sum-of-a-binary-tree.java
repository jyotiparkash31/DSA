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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int max=Integer.MIN_VALUE;
        int result=0,currlevel=1;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            while(size-->0){//it has all node of one level
                TreeNode node=q.poll();
                sum+=node.val;//sum of all node val in that level
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            if(sum>max){
                max=sum;
                result=currlevel;
            }
            currlevel++;
        }
        return result;
    }
}