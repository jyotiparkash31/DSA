class Solution {
    public int findFinalValue(int[] nums, int original) {
        int[] arr=new int[1001];
        for(int i : nums){
            arr[i]++;
        }
        while(original<1001 && arr[original]!=0){
            original*=2;
        }
        return original;
    }
}