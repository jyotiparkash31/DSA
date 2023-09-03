class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] even=new int[26],odd=new int[26];
        
        //all will cancel out if both can be equaled by swaping
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even[s1.charAt(i)-'a']++;
                even[s2.charAt(i)-'a']--;
            }else{
                odd[s1.charAt(i)-'a']++;
                odd[s2.charAt(i)-'a']-- ; 
            }
        }
        
         for (int i = 0; i < odd.length; ++i) {
        if (odd[i] != 0 || even[i] != 0) return false;
    }
    return true;
    }
}