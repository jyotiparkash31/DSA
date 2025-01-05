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
        
        Map<Integer,Integer> map=new HashMap<>();
        int level=1;
        dfs(root,level,map);
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int l=entry.getKey();
            int v=entry.getValue();
            if(v>max){
                max=v;
                ans=l;
            }
        }
        return ans;
        //bfs
        // Queue<TreeNode> q=new LinkedList<>();
        // q.offer(root);
        // int max=Integer.MIN_VALUE;
        // int result=0,currlevel=1;
        // while(!q.isEmpty()){
        //     int size=q.size();
        //     int sum=0;
        //     while(size-->0){//it has all node of one level
        //         TreeNode node=q.poll();
        //         sum+=node.val;//sum of all node val in that level
        //         if(node.left!=null){
        //             q.offer(node.left);
        //         }
        //         if(node.right!=null){
        //             q.offer(node.right);
        //         }
        //     }
        //     if(sum>max){
        //         max=sum;
        //         result=currlevel;
        //     }
        //     currlevel++;
        // }
        // return result;
    }
    //simple dfs approch in which storing the level and values of that level and at the end find the max from the map
    public void dfs(TreeNode root, int level, Map<Integer,Integer> map){
        if(root==null){
            return;
        }
        Integer val=map.get(level);
        if(val==null){
            map.put(level,root.val);
        }else{
            map.put(level,val+root.val);
        }
        dfs(root.left,level+1,map);
        dfs(root.right,level+1,map);
    }
}