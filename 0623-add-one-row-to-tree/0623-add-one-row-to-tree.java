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

 //this is the dfs approch in which we have created the helper function and we are using the recursive nature of tree 
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
    //    int count=1;
    //    return addRow(root,val,depth,count); 
    int count=0;
    Queue<TreeNode> que=new LinkedList<>();
    que.offer(root);
    while(!que.isEmpty()){
        int size=que.size();
        count++;
        while(size>0){
            TreeNode node=que.poll();
            System.out.print(count);
            if(count!=depth-1){
                if(node.left!=null){
                    que.offer(node.left);
                }
                if(node.right!=null){
                     que.offer(node.right);
                }
            }else{
                // TreeNode newNode = new TreeNode(val);
                //    newNode.left = node.left;
                //    node.left = newNode;
                //    TreeNode newNode2 = new TreeNode(val);
                //    newNode2.right = node.right;
                //    node.right = newNode2;


                TreeNode one=node.left;
                TreeNode second=node.right;

                node.left=new TreeNode(val);
                node.right=new TreeNode(val);

                node.left.left=one;
                node.right.right=second;
            }
            size--;
        }

    }
    return root;



    }
    // public TreeNode addRow(TreeNode root, int val, int depth,int count){
      
    //   if(root==null){
    //     return null;
    //   }
    //   if(count==depth-1){
    //     TreeNode one=root.left;
    //     TreeNode second=root.right;

    //     root.left=new TreeNode(val);
    //     root.right=new TreeNode(val);

    //     root.left.left=one;
    //     root.right.right=second;

    //     return root;
    //   }
    //   root.left=addRow(root.left,val,depth,count+1); 
    //   root.right=addRow(root.right,val,depth,count+1); 

    //   return root;

    // }
}