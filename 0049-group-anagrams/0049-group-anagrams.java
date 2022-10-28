class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s: strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key))
                map.put(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
        
        //brute force
//         List<List<String>> ans = new ArrayList<>();
//         if (strs == null || strs.length == 0) {
//             return ans;
//         }

//         int len = strs.length;
//         boolean[] visited = new boolean[len];
//         for (int i = 0; i < len; i++) {
//             if (visited[i]) {
//                 continue;
//             }

//             List<String> list = new ArrayList<>();
//             String word = strs[i];
//             list.add(word);
//             visited[i] = true;
            
//             for (int j = i + 1; j < len; j++) {
//                 if (checkAnagram(word, strs[j]) && !visited[j]) {
//                     list.add(strs[j]);
//                     visited[j] = true;
//                 }
//             }

//             ans.add(list);
//         }

//         return ans;
    }
    // public boolean checkAnagram(String s, String t) {
    //  if(s.length()!=t.length()){
    //         return false;
    //     }
    //     int[] count = new int[26];
    //     for(int i=0;i<s.length();i++){
    //         count[s.charAt(i)-'a']++;
    //         count[t.charAt(i)-'a']--;
    //     }
    //     for(int i:count){
    //         if(i!=0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
