class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int n = arr.length;
        long count = 0;
        long mod = 1000000007;
        for(int i = 0; i < n; i++) {
            //similar to two sum problem solution
            int new_target = target - arr[i];
            int start = i + 1;
            int end = n;
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            
            for(int j = start; j < end; j++) {
                if(hm.get(new_target - arr[j]) != null) 
                    count += hm.get(new_target - arr[j]);
                if(hm.get(arr[j]) != null)
                    hm.put(arr[j], hm.get(arr[j])+1);
                else
                    hm.put(arr[j], 1);
            }
        }
        return (int)(count % mod);
        
        
//         long count=0;
//         long mod=(int)1e9+7;
//         for(int k=0;k<arr.length;k++){
//             int ntarget=target-arr[k];
//            Map<Integer,Integer> map = new HashMap<>();
//        for (int i=k+1; i<arr.length; i++){
//            if(map.get(ntarget-arr[i])!=null)
//                count+=map.get(ntarget-arr[i]);
//             if(map.get(arr[i]) != null)
//                 map.put(arr[i], map.get(arr[i])+1);
//             else
//                 map.put(arr[i], 1);
//        }
              
        
//     }
//         return (int)(count%mod);
    }
}