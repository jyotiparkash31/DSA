class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        int n=arr.length;
        int count=0;
        int i=0;
        for(i=1;i<1000+n;i++){
            if(!set.contains(i)){
                count++;
                if(count==k){
                    break;
                }
            }
            
        }
        return i;
    }
}