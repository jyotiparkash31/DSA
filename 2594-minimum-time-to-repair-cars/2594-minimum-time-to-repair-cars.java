class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = -1, right = (long) Math.pow(10, 14) + 1;
        while (right - left > 1) {
            long mid = left + (right - left) / 2;
            if (isPossible(ranks, cars, mid)) right = mid;
            else left = mid;
        }
        return right;
    }
      public boolean isPossible(int[] ranks, int cars, long mid) {
        int countCars = 0;
        for (int rank : ranks) {
            countCars += Math.sqrt((double) mid / rank);
            if (countCars >= cars) return true;
        }
        return countCars >= cars;
    }
}