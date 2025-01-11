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
    int ans=0;
    Map<Integer,List<Integer>> map=new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        dfs(root,start);
        return ans;
        // buildGraph(root,start);
        // Queue<Integer> queue=new LinkedList<>();
        // queue.offer(start);
        // int min=0;
        // Set<Integer> visited=new HashSet<>();
        // visited.add(start);
        // while(!queue.isEmpty()){
        //     int size=queue.size();
        //     while(size>0){
        //         int curr=queue.poll();
        //         for(int num:map.get(curr)){
        //             if(!visited.contains(num)){
        //                 visited.add(num);
        //                 queue.add(num);
        //             }
        //         }
        //        size--;

        //     }
        //     min++;
        // }
        // return min-1;
    }

    public int dfs(TreeNode root,int start){
        if(root==null){
            return 0;
        }
        int l=dfs(root.left,start);
        int r=dfs(root.right,start);
        if(root.val==start){
            ans= Math.max(l,r);
            return -1;
        }
        else if(l>=0 && r>=0){
            return Math.max(l,r)+1;
        }else{
            int d=Math.abs(l)+Math.abs(r);
            ans=Math.max(ans,d);
            return Math.min(l,r)-1;
        }
        
    }
//important concept for building a graph from tree
    // public void buildGraph(TreeNode root,int parent){
    //     if(root==null)return;
    //     if(!map.containsKey(root.val)){
    //         map.put(root.val,new ArrayList<>());
    //     }
    //     if(parent!=0){
    //         map.get(root.val).add(parent);
    //     }
    //     if(root.left!=null){
    //         map.get(root.val).add(root.left.val);
    //     }
    //     if(root.right!=null){
    //         map.get(root.val).add(root.right.val);
    //     }
    //     buildGraph(root.left,root.val);
    //     buildGraph(root.right,root.val);
    // }


}