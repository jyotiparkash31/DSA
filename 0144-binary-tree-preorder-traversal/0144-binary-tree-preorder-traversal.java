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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new LinkedList<>();
        Stack<TreeNode> st=new Stack();
        TreeNode curr=root;
        while(curr!=null){
            res.add(curr.val);
            if(curr.right!=null){
                st.push(curr.right);
            }
            curr=curr.left;
            if(curr==null && !st.isEmpty()){
                curr=st.pop();
            }
        }
        return res;
        
	// List<Integer> list = new LinkedList<Integer>();
	// Stack<TreeNode> rights = new Stack<TreeNode>();
	// while(node != null) {
	// 	list.add(node.val);
	// 	if (node.right != null) {
	// 		rights.push(node.right);
	// 	}
	// 	node = node.left;
	// 	if (node == null && !rights.isEmpty()) {
	// 		node = rights.pop();
	// 	}
	// }
	// return list;
    }
}