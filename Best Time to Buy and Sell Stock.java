class Solution {
    public int maxProfit(int[] pr) {
        int min=Integer.MAX_VALUE;
        int val=0;
        int max=0;
        for(int i=0;i<pr.length;i++){
            if(pr[i]<min){
                min=pr[i];
            }
            val=pr[i]-min;
            if(max<val)
            {
                max=val;
            }
        }
      return max;
    }
}