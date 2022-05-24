class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;){
            int j=i+1;
        while(j<words.length && isAngram(words[i],words[j])){
           j++;
            }
        res.add(words[i]);
            i=j;
        }
        return res;
    }
    public boolean isAngram(String s,String t){
        int[] count=new int[26];
        if(s.length()!=t.length())return false;
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
    }
}