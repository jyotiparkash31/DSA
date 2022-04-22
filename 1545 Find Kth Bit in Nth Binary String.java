class Solution {
    public char findKthBit(int n, int k){
//           if(n == 1)
//             return '0'; // S1 can only give '0'
        
//         int len = Math.pow(2,n); // length of imaginary Sn (same as doing 'Math.pow(2,n)' )
        
//         if(k < len/2) 
//             return findKthBit(n-1, k);  // the string to the left of middle character is the same as the string Sn-1
        
//         if(k == len/2)
//             return '1'; // the middle character from S2 ... Sn will always be '1'
        
//         return findKthBit(n-1, len - k) == '0' ? '1' : '0'; 
        
        
           if(n==1 && k==1) return '0';
        int length = (int)Math.pow(2,n) - 1;
        int mid = length / 2;
        if(k <= mid) return findKthBit(n-1, k);
        else if(k > mid + 1) return findKthBit(n-1, length + 1 - k)=='0'? '1':'0';
        else return '1';
       
    }
   
           

}