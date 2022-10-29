class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        // int n = plantTime.length, result = 0, plant = 0;
        // int[][] count = new int[n][2];
        // for(int i = 0; i < n; i++) {
        //     count[i][0] = plantTime[i];
        //     count[i][1] = growTime[i];
        // }
        // Arrays.sort(count, (a, b) -> b[1] - a[1]);
        // //we can use this also-> Integer.compare(b[1], a[1]));
        // for(int[] e: count) {
        //     plant += e[0];
        //     result = Math.max(plant + e[1], result);
        // }
        // return result;
        List<pair> plant=new ArrayList<>();
        int time=0,ans=0;
        for(int i=0;i<plantTime.length;i++){
            plant.add(new pair(plantTime[i],growTime[i]));
        }
        Collections.sort(plant,(a,b) ->b.growTime-a.growTime);
        for(int i=0;i<plantTime.length;i++){
            time+=plant.get(i).plantTime;
            ans=Math.max(ans,time+plant.get(i).growTime);
        }
        return ans;
    }
    private class pair{
        int plantTime;
        int growTime;
       public pair(int p, int g){
            this.plantTime=p;
            this.growTime=g;
        }
    }
}