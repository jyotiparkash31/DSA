class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n=maxHeights.size(); long ans=0; 
        for(int i=0;i<n;i++){ 
            long sum=maxHeights.get(i);
            int prev=maxHeights.get(i);
            for(int j=i-1;j>=0;j--){ 
                prev=Math.min(maxHeights.get(j),prev);
                sum+=prev;
            } 
            prev=maxHeights.get(i); 
            for(int k=i+1;k<n;k++){ 
                prev=Math.min(prev,maxHeights.get(k)); 
                sum+=prev;
            } 
            if(sum>ans) ans=sum;
        } 
        return ans;
    }
}