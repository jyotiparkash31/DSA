class Solution {
    public int closetTarget(String[] words, String target, int s) {
//         int dis=0;
//         int n=words.length;
//         Boolean[] visited=new Boolean[n];
//         for(int i=0;i<n;i++){
//             visited[i]=false;
//         }
//         System.out.println(visited[0]);
//         int r=s;
//         int l=s;
//         while(!visited[l] && !visited[r]){
//             if(words[l].equals(target) || words[r].equals(target)){
//                 return dis;
//             }
//             visited[l]=true;
//             visited[r]=true;
//             dis++;
//             l--;
//             r++;
//             if(l==-1)l=n-1;
            
//             if(r==n)r=0;
//         }
//        return -1;
        
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                int dist = Math.abs(i - s);
                int oppDist = words.length - dist;
                ans = Math.min(ans, Math.min(dist, oppDist));
            }
        }

        return ans == Integer.MAX_VALUE? -1: ans;
    }
}