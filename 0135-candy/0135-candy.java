// Do it in two directions.
// The first loop makes sure children with a higher rating get more candy than its left neighbor; the second loop makes sure children with a higher rating get more candy than its right neighbor.


class Solution {
    public int candy(int[] ratings) {
         int n = ratings.length;
      int[] res = new int[n];
      Arrays.fill(res, 1);
      for(int i = 1; i < n; i++){
        if(ratings[i] > ratings[i - 1]){
          res[i] = res[i - 1] + 1;            
        }  
      }    
      
      for(int i = n - 1; i > 0; i--){
        if(ratings[i - 1] > ratings[i]){
          res[i - 1] = Math.max(res[i] + 1, res[i - 1]);    
        }
      }
      
      int sum = 0;
      for(int r: res) sum += r;
      
      return sum;
    }
}