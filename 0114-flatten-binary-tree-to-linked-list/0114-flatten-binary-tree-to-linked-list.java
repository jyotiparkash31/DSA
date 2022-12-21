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

//iterative
class Solution {
    public void flatten(TreeNode root) {
        if(root==null)return;
      Stack<TreeNode> st=new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            
           TreeNode curr=st.pop();
           if(curr.right!=null)st.push(curr.right);
           if(curr.left!=null)st.push(curr.left);
           if(!st.isEmpty()){
                curr.right=st.peek();
            }
            curr.left=null;
        }
        
        
//          if(root==null) return;
        
//         TreeNode pre = new TreeNode(-1);        
//         Stack<TreeNode> st = new Stack<>();
        
//         st.add(root);
//         while(!st.isEmpty())
//         {
//             TreeNode node = st.pop();
//             pre.right = node;
//             //don't forget to set left to null
//             pre.left = null;
//             if(node.right!=null) st.push(node.right);
//             if(node.left!=null) st.push(node.left);
//             pre = node;
//         } 
    }
}