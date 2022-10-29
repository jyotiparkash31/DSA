class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length, result = 0, plant = 0;
        int[][] count = new int[n][2];
        for(int i = 0; i < n; i++) {
            count[i][0] = plantTime[i];
            count[i][1] = growTime[i];
        }
        Arrays.sort(count, (a, b) -> b[1] - a[1]);
        //we can use this also-> Integer.compare(b[1], a[1]));
        for(int[] e: count) {
            plant += e[0];
            result = Math.max(plant + e[1], result);
        }
        return result;
    }
}