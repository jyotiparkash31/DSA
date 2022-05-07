class Solution {
    public boolean find132pattern(int[] nums) {
       Stack<Integer>st =new Stack<>();
        int sec2=Integer.MIN_VALUE;//second peak element
        for(int i=nums.length-1;i>=0;i--){
            if(sec2>nums[i])return true;//cheking if min element is smaller thensecond peak element 
            while(!st.empty() && nums[i]>st.peek()){
                sec2=st.pop();//updating sec2 element
            }
            st.push(nums[i]);
        }
        return false;
        // Stack<int[]>stack =new Stack<>();
        // int min = nums[0];
        // for(int i = 1; i < nums.length; i++) {
        //     while(!stack.isEmpty() && nums[i] >= stack.peek()[0]) {
        //         stack.pop();
        //     }
        //     if(!stack.isEmpty() && nums[i] > stack.peek()[1]) {
        //         return true;
        //     }
        //     stack.push(new int[]{nums[i], min = Math.min(nums[i], min)});
        // }
        // return false;
    }
}