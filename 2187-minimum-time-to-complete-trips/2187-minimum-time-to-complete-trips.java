class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min=0;
        long max=(long)time[0]*totalTrips;
        
        while(min<max){
            long mid=(min+max)/2;
            long timeTaken=getCompletedTrip(time,mid);
            if(timeTaken>=totalTrips){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
    
    public long getCompletedTrip(int[] time,long timeAvaliable){
        long minTime=0;
        for(long busTime:time){
            minTime+=timeAvaliable/busTime;
        }
        return minTime;
    }
}