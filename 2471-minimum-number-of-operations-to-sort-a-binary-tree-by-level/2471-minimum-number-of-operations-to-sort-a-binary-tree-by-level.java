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
    //just do level order traversal and make operation to sort an array
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int res=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            while(size-->0){
                TreeNode curr=q.poll();
                list.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            res+=operationToSort(list);//Minimum swaps to sort an array or min oper to sort an array
        }
        return res;
    }
    public int operationToSort(List<Integer>list){
         Map<Integer,Integer> map=new HashMap<>();
        List<Integer> temp=new ArrayList<>(list);
        Collections.sort(temp);
        for(int i=0;i<list.size();i++){
            map.put(list.get(i),i);
        }

         int swaps = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!temp.get(i).equals(list.get(i))) {
                // Index of the element that should be at index i
                int ind = map.get(temp.get(i));

                // Swapping elements to their correct positions
                int tempValue = list.get(i);
                list.set(i, list.get(ind));
                list.set(ind, tempValue);

                // Update the indices in the hashmap
                map.put(list.get(i), i);
                map.put(list.get(ind), ind);

                swaps++;
            }
        }
        return swaps;
    }
}