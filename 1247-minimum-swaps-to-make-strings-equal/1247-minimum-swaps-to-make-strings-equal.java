class Solution {
    public int minimumSwap(String s1, String s2) {
        int x1=0;
        int x2=0;
        int y1=0;
        int y2=0;
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i))continue;
            if(s1.charAt(i)=='x')x1++;
            else y1++;
            if(s2.charAt(i)=='x')x2++;
            else y2++;
        }
        if((x1+x2)%2!=0 || (y1+y2)%2!=0)return -1;
        
        int ans=0;
        boolean flag=true;
        
        while(flag){
            flag=false;
            
            if((x1-2)>=0 && (y2-2)>=0){
                ans++;
                x1=x1-2;
                y2=y2-2;
                flag=true;
            }
            if((x2-2)>=0 && (y1-2)>=0){
                ans++;
                x2=x2-2;
                y1=y1-2;
                flag=true;
            }
        }
        if(x1==1 && y1==1 && x2==1 && y2==1)
          ans+=2;
             return ans;
    }
}