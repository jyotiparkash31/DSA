class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0)return new int[0];
        int n=matrix.length,m=matrix[0].length;
        int r=0;
        int c=0;
        int[] arr=new int[n*m];
        for(int i=0;i<arr.length;i++){
            arr[i]=matrix[r][c];
            if((r+c)%2==0){
              if      (c == m - 1) { r++; }
                else if (r == 0)     { c++; }
                else            { r--; c++; }  
            }else{
                 if      (r == n - 1) { c++; }
                else if (c == 0)     { r++; }
                else            { r++; c--; }
            }
        }
        return arr;
    }
}