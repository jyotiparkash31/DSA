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
    class NodeIndex{
        TreeNode node;
        int index;
        NodeIndex(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int width = 0;
    Deque<NodeIndex> deque = new LinkedList<>();
    deque.add(new NodeIndex(root, 0));

    while (!deque.isEmpty()) {
        int size = deque.size();
        int left = deque.peekFirst().index;
        int right = deque.peekLast().index;
        width = Math.max(width, right - left + 1);
        while (size-- > 0) {
            NodeIndex nodeIndex = deque.poll();
            TreeNode node = nodeIndex.node;
            int index = nodeIndex.index;

            if (node.left != null) {
                deque.add(new NodeIndex(node.left, index * 2));
            }
            if (node.right != null) {
                deque.add(new NodeIndex(node.right, index * 2 + 1));
            }
        }
    }

    return width;
    }
}