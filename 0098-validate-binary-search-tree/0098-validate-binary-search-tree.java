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
    
    List<Integer> list = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
		return isSortedArray();
    }
    private boolean isSortedArray() {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) >= list.get(i + 1)) {
				return false;
			}
		}
        
		return true;
	}

	private void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		list.add(root.val);
		inOrder(root.right);
	}
    
    //itreative inorder traversal 
//     List<Integer> list = new ArrayList<>();
//     if(root == null) return list;
//     Stack<TreeNode> stack = new Stack<>();
//     while(root != null || !stack.empty()){
//         while(root != null){
//             stack.push(root);
//             root = root.left;
//         }
//         root = stack.pop();
//         list.add(root.val);
//         root = root.right;
        
//     }
//     return list;
}