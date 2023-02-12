class Solution {
    public int takeCharacters(String s, int k) {
        int a=0,b=0,c=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a')
                a++;
            else if(s.charAt(i)=='b')
                b++;
            else c++;
        }
        
        if(a < k || b < k || c < k){
            return -1;
        }
        
        a=a-k;
        b=b-k;
        c=c-k;
        int i=0,j=0;
        int ans=0;
        int count_a=0,count_b=0,count_c=0;
        while(j<n){
            if(s.charAt(j)=='a')count_a++;
            else if(s.charAt(j)=='b')count_b++;
            else count_c++;
            
             while(a < count_a || b < count_b || c < count_c){
                 if(s.charAt(i)=='a')count_a--;
                 else if(s.charAt(i)=='b')count_b--;
                 else count_c--;
                 i++;
             }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return n-ans;
    }
}