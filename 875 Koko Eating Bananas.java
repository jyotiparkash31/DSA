class Solution {
    public int minEatingSpeed(int[] A, int h) {
    int max=A[0];
        int k=0;
        for(int i=0;i<A.length;i++)
        {
            max=Math.max(max,A[i]);
        }
        System.out.print(max);
        int start=0;
        int end=max;
        
        while(start<=end)
        {
            k=(end+start)/2;
            int count=0;
            for(int i=0;i<A.length;i++)
            {
              count+=Math.ceil(1.0*A[i]/k);//ceil is used only for double value thats why we use1.0*A[i]
            }
            if(count>h)
                start=k+1;
            else
                end=k-1;
        }
        return start;
    }
}