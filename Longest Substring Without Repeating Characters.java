class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sum=0;
        for(int i=0;i<=s.length();i++){
           Map<Character,Integer> map=new HashMap<>();
           int count=0;
            String t=s.substring(i,s.length());
            for(int j=0;j<t.length();j++){
                if(!map.containsKey(t.charAt(j))){
                    count++;
                    map.put(t.charAt(j),1);
                } 
                else{
                    break;
                }
            }
            if(count>sum)
                sum=count;

        }
        return sum;
    }
}