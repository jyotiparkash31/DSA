class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> res=new ArrayList<>();
        // res.add(new ArrayList<>());//initalize the res by empty list
        // for(int num:nums){
        //     int size=res.size();//to build the same no. of list
        //     for(int i=0;i<size;i++){
        //     List<Integer> curr=new ArrayList<>(res.get(i));//creating copy and then adding the num 
        //         curr.add(num);
        //         res.add(curr);
        //     }
        // }
        // return res;
        
         List<List<Integer>> list = new ArrayList<>();
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
    }
    
private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}
}