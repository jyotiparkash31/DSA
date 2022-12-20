class Solution {
    public int maxConsecutiveAnswers(String ak, int k) {
        //maximum substring of 'T' which contains k 'F'
        
        int max=0,low=0;
        int count=0;
        for(int i=0;i<ak.length();i++){
            if(ak.charAt(i)=='F')count++;
            while(count>k){
              if(ak.charAt(low)=='F')count--;//sliding low to right
                low++;
            }
            max=Math.max(max,i-low+1);
        }
        
        ////maximum substring of 'F' which contains k 'T'
        count=0;low=0;
        for(int i=0;i<ak.length();i++){
            if(ak.charAt(i)=='T')count++;
            while(count>k){
              if(ak.charAt(low)=='T')count--; //sliding low to right
                low++;
            }
            max=Math.max(max,i-low+1);
        }
        return max;
    }

}