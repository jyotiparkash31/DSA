class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xDiff=Math.abs(fx-sx);
        int yDiff=Math.abs(fy-sy);
        int maxDiagonal= Math.min(xDiff,yDiff);
        xDiff-=maxDiagonal;
        yDiff-=maxDiagonal;
        maxDiagonal+=xDiff+yDiff;
        if(maxDiagonal==0){
            return t!=1;
        }
        if(maxDiagonal<=t)
            return true; 
        else return false;
    }
}