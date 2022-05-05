class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=desiredRow(matrix,target);
        if(row==-1)return false;
        int start=0;
        int end=matrix[0].length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
    public int desiredRow(int[][] matrix,int target){
        int s=0;
        int e=matrix.length-1;
        int m=matrix[0].length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(matrix[mid][0]<=target && matrix[mid][m]>=target){
                return mid;
            }
            else if(matrix[mid][0]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}