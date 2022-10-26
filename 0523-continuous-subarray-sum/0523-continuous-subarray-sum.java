class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       Map<Integer, Integer> hashMap = new HashMap<>(Map.of(0, 0));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // if the remainder sum % k occurs for the first time
            if (!hashMap.containsKey(sum % k))
                hashMap.put(sum % k, i + 1);
            // if the subarray size is at least two
            else if (hashMap.get(sum % k) < i)
                return true;
        }
        return false;
        
//CONCEPT
        // another short version of an explanation: say the the difference is d between a and b, such as d = b - a(b is on the right of a). you want d is multiple of k, so you just need d % k = 0. Because d = b - a, so d % k = 0 = (b - a) %k. so (b-a)%k=0 equal b%k - a%k = 0, then b%k = a%k. Comparing other hashtable based problem, you need check b-k whether in the hashtable. In this problem , you always check b%k, and always pust a%k into hashtable. when k = 0, you need do it as other similar problem.
    }
}