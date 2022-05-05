class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // boolean flag=false;
        // for(int i=0;i<matrix.length;i++){
        //     flag=binarySearch(matrix,target,i);
        //     if(flag==true)break;
        // }
        // return flag;
        int row=0;
        int col=matrix[0].length-1;
            while(col>=0 && row<matrix.length){
               if(matrix[row][col]==target){
                   return true;
               }
                else if(matrix[row][col]<target){
                    row++; 
                }
                else{
                    col--;
                }
            
            }
        return false;
    }
    // public boolean binarySearch(int[][] matrix, int target,int i){
    //     int start=0;
    //     int end=matrix[i].length-1;
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(matrix[i][mid]==target){
    //             return true;
    //         }else if(matrix[i][mid]>target){
    //             end=mid-1;
    //         }else{
    //             start=mid+1;
    //         }
    //     }
    //     return false;
    //}
}