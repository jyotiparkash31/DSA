class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            res.add(i);
        }
        int index=0;
        // int ans=-1;
            int ans=helper(res,k-1,index);
        return ans;
        
    }
    public int helper(List<Integer> res,int k,int index){
        if(res.size()==1){
          return res.get(0);
             
        } 
        
         index=(index+k)%res.size();
        res.remove(index);
       // System.out.println(res.remove(index)) ;
       return helper(res,k,index);
        
    }
}