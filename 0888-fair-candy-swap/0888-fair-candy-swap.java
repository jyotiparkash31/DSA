class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum_al=0;
        int sum_bob=0;
        for(int candy:aliceSizes)
        {
            sum_al+=candy;
        }
        for(int candy:bobSizes)
        {
            sum_bob+=candy;
        }
           
        int diff=(sum_al-sum_bob)/2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : aliceSizes) S.add(a);
        for (int b : bobSizes) if (S.contains(b + diff)) return new int[] {b + diff, b};
        return new int[0];
        
    }
}