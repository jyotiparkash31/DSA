class Solution {
    public boolean digitCount(String num) {
//         int n=num.length();
//         Map<Integer,Integer> map=new HashMap<>();
//         for(char c:num.toCharArray()){
//             int ch=c-'0';
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         for(int i=0;i<n;i++){
//             int x=num.charAt(i)-'0';
//              if(map.containsKey(i) == true){
//                  if(x!=map.get(i)){
//                 return false;
//                 }
//              }else if(x!=0){
//                  return false;
//              }
            
//         }
//         return true;
        
       // BY CREATING FREQUENCY ARRAY
         int[] freq = new int[10];
        for(char c : num.toCharArray()){
            freq[c-'0']++;
        }
        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i)-'0' != freq[i]) return false;
        }
        return true;
    }
}