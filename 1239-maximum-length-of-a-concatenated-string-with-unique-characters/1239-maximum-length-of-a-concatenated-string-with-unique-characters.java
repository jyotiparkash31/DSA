class Solution {
    public int maxLength(List<String> arr) {
        //  if (arr == null || arr.size() == 0) return 0;
        // int[] max = new int[1];
        // dfs("", 0, arr, max);
        // return max[0];
        return solve(arr,0,"");
    }
//    public void dfs(String path, int index, List<String> arr, int[] max) {
//         if (!isUniqueChars(path)) return;
        
//         max[0] = Math.max(max[0], path.length());
//         if (index == arr.size()) return;
        
//         // for each string in arr
//         for (int i = index; i < arr.size(); i++) {
//             if (!isUniqueChars(arr.get(i))) continue;
//             // try subsequent strings in arr
//             dfs(path + arr.get(i), i+1, arr, max);
//         }
//     }
//     public boolean isUniqueChars(String s){
//          Set<Character> set = new HashSet<>();

//         for (char c : s.toCharArray()) {
//             if (set.contains(c)) {
//                 return false;
//             }
//             set.add(c);
//         }
//         return true;
//     }
    
// TAKE OR NOT TAKE CONCEPT
      public int solve(List<String> arr, int i, String soFar)
    {
        if(i == arr.size())
        {
            if(isValid(soFar))
            {
                return soFar.length();
            }
            return 0;
        }
        
        int size1 = solve(arr, i+1, soFar);
        int size2 = solve(arr, i+1, soFar+arr.get(i));
        
        return Math.max(size1, size2);

    }
    
     public boolean isValid(String s){
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