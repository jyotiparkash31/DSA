class Solution {
    public long minimumPossibleSum(int n, int target) {
        long ans=0;
        int i=1;
        for( ;i<=target/2 && i<=n;i++){
            ans += i;
        }
        int j=target;
        while(i<=n){
            ans +=j;
            j++;
            i++;
        }
        return ans;
    }
}