class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int len1=s1.length();
        int len2=s2.length();
        int[] count=new int[26];

//fill upto s1 len
        for(int i=0;i<len1;i++){
            count[s1.charAt(i)-'a']--;
            count[s2.charAt(i)-'a']++;
        }
        //compare after that
        if(allZero(count)){
            return true;
        }
        //"ab", s2 = "eidbaooo"
        //slide 
        for(int i=0;i<len2-len1;i++){
            count[s2.charAt(i+len1)-'a']++;
            count[s2.charAt(i)-'a']--;
            
            if(allZero(count))return true;
        }
        return false;
    }
    private boolean allZero(int[] count){
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
        }    
}
// Input
// s1 = "ab"
// s2 = "eidbaooo"

// Window "ei"
// a:-1, b:-1, e:+1, i:+1 ❌

// Slide → "id"
// i:0, d:+1 ❌

// Slide → "db"
// d:0, b:0, a:-1 ❌

// Slide → "ba"
// a:0, b:0 ✅