class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> data = new HashSet<Integer>();
        for(int i=0;i<nums2.length;i++){
            data.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(!data.contains(nums1[i])){
                l.add(nums1[i]);
                data.add(nums1[i]);
            }
        }
        data.clear();
        for(int i=0;i<nums1.length;i++){
            data.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(!data.contains(nums2[i])){
                al.add(nums2[i]);
                 data.add(nums2[i]);
            }
        }
        ans.add(l);
        ans.add(al);
        return ans;
      
    }
}