class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];//The idea is simple. It creates a size 26 int arrays as buckets for each letter in alphabet. It increments the bucket value with String s and decrement with string t. So if they are anagrams, all buckets should remain with initial value which is zero
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
        //another solutionusing sort
//         char[] sChar = s.toCharArray();
//     char[] tChar = t.toCharArray();
    
//     Arrays.sort(sChar);
//     Arrays.sort(tChar);
    
//     return Arrays.equals(sChar, tChar); 
    }
}