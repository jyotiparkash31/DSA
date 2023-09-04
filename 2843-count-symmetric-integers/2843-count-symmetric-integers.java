class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int ans=0;
        while(low <=high){
            String temp=Integer.toString(low);
            if(temp.length()%2==1){
                low=(int)Math.pow(10,temp.length());
            }else{
                int i=0,j=temp.length()-1,s=0;
                while(i<=j){
                     s += temp.charAt(i++)- '0';
                     s -= temp.charAt(j--) -'0';
                }
                if(s == 0) ans++;
                low++;
            }
        }
        return ans;
    }
}