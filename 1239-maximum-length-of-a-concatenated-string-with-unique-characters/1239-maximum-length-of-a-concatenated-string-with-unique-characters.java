class Solution {
    public int maxLength(List<String> arr) {
         if (arr == null || arr.size() == 0) return 0;
        int[] max = new int[1];
        dfs("", 0, arr, max);
        return max[0];
    }
   public void dfs(String path, int index, List<String> arr, int[] max) {
        if (!isUniqueChars(path)) return;
        
        max[0] = Math.max(max[0], path.length());
        if (index == arr.size()) return;
        
        // for each string in arr
        for (int i = index; i < arr.size(); i++) {
            if (!isUniqueChars(arr.get(i))) continue;
            // try subsequent strings in arr
            dfs(path + arr.get(i), i+1, arr, max);
        }
    }
    public boolean isUniqueChars(String s){
         Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
    
}