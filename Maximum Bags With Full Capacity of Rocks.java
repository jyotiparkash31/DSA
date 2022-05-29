class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int add) {
        int n=rocks.length;
        // int[] arr=new int[n];
        for(int i=0;i<n;i++){
           capacity[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i=0;i<n;i++){
            if(add>=capacity[i]|| capacity[i]==0){
                add=add-capacity[i];
                count++;  
            }
        }
        return count;
    }
}