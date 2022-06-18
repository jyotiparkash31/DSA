class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        int temp=num;
        int b=(int)Math.pow(10,k);
        int r=(int)Math.pow(10,k-1);
        while(!(num<r)){
            int a=num%b;
            if(a!=0){
                 if(temp%a==0){
                count++;
            } 
            }
          
            num=num/10;
        }
        return count;
    }
}