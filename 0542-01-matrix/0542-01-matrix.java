class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});// all 0s go into queue
                }else{
                    mat[i][j]=-1;//mark unvisited
                }
            }
        }
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        int length=0;
        while(!q.isEmpty()){
            int size=q.size();
            length++;
            while(size-->0){//size tak to traverse krega then new input que ka wo chalega
                int[] cell=q.poll();
                for(int[] dir:dirs){
                    int r=cell[0]+dir[0];
                    int c=cell[1]+dir[1];
                    //agar 0 or visited hai to continue 
        if(r<0 || c<0 ||r==mat.length|| c==mat[0].length || mat[r][c]!=-1)                 continue;
                    mat[r][c]=length;
                    q.add(new int[]{r,c});
                }
            }
        }
        return mat;
    }
}
//All 0s start BFS together (multi-source BFS)
// First time we reach a cell = shortest distance
// length increases per BFS layer
// Reverse the search direction
// It turns:
// many BFS (slow)
// into:
// one BFS (fast)