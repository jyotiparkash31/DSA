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

    //this approch is used in all the problem in which we have to convert to map and check the level for any problem
    //build bidirectional graph and use queue to go thought each level and find ans according and modify some logic 
    Map<TreeNode,List<TreeNode>> map= new HashMap<>();
    Set<TreeNode> set=new HashSet<>();
    public int countPairs(TreeNode root, int distance) {
        
        buildGraph(root,null);
        int count=0;
        for(TreeNode node:set){
            
            Queue<TreeNode> q=new LinkedList<>();
            Set<TreeNode> visited=new HashSet<>();
            q.offer(node);
            visited.add(node);
            for(int level=0;level<=distance;level++){
                int size=q.size();
                while(size-->0){
                    TreeNode curr=q.poll();
                    
                    if(curr!=node && set.contains(curr)){
                        count++;
                    }
                    //itirate thought the neighbour of graph and store in queue and marking node if visited
                  // Iterate through the neighbors and process unvisited nodes
                    List<TreeNode> neighbors = map.get(curr);
                    if (neighbors != null) { // Ensure neighbors are not null
                        for (TreeNode ngbr : neighbors) {
                            if (!visited.contains(ngbr)) {
                                q.offer(ngbr);
                                visited.add(ngbr);
                            }
                        }
                    }
                }
            }
           
        }
        return count/2;

    }
    //build a bidirection graph from tree
    public void buildGraph(TreeNode root,TreeNode parent){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            set.add(root);
        }
          // Ensure the current node is in the map
        map.putIfAbsent(root, new ArrayList<>());
         // Add bidirectional edges between the current node and its parent
        if (parent != null) {
            map.putIfAbsent(parent, new ArrayList<>());
            map.get(root).add(parent);
            map.get(parent).add(root);
        }

        // Recursively build the graph for left and right subtrees
        buildGraph(root.left, root);
        buildGraph(root.right, root);
    }
}