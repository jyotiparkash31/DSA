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
    public TreeNode replaceValueInTree(TreeNode root) {
        //First calculate the sum of every level
        //then use the parent to access the child and update the child val by 
        // total sum of the level - sibling sum
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> sum= new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int currsum=0;
            while(size-->0){
                TreeNode node=q.poll();
                currsum+=node.val;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            sum.add(currsum);
        }


        q.offer(root);
        root.val=0;
        int i=1;
        while(!q.isEmpty()){
            int siblingsum=0;
            int size=q.size();
            while(size-->0){
                 TreeNode node=q.poll();

            if(node.left!=null){
             siblingsum=node.left.val;
            }else{
               siblingsum=0;
            }
            
            if(node.right!=null){
                siblingsum+=node.right.val;    
             }else{
                 siblingsum+=0;
             }
             if(node.left!=null){
                node.left.val=sum.get(i)-siblingsum;
                q.offer(node.left);
             }
             if(node.right!=null){
                node.right.val=sum.get(i)-siblingsum;
                q.offer(node.right);
             }

            }
            i++;
        }
        return root;
    }
}