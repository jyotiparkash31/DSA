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
    Map<Integer,List<Integer>> map=new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        buildGraph(root,start);
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(start);
        int min=0;
        Set<Integer> visited=new HashSet<>();
        visited.add(start);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                int curr=queue.poll();
                for(int num:map.get(curr)){
                    if(!visited.contains(num)){
                        visited.add(num);
                        queue.add(num);
                    }
                }
               size--;

            }
            min++;
        }
        return min-1;
    }

    public void buildGraph(TreeNode root,int parent){
        if(root==null)return;
        if(!map.containsKey(root.val)){
            map.put(root.val,new ArrayList<>());
        }
        if(parent!=0){
            map.get(root.val).add(parent);
        }
        if(root.left!=null){
            map.get(root.val).add(root.left.val);
        }
        if(root.right!=null){
            map.get(root.val).add(root.right.val);
        }
        buildGraph(root.left,root.val);
        buildGraph(root.right,root.val);
    }


}