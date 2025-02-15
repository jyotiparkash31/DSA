class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        int sum=0;
        for(int i: asteroids){
            if(i>0){//if positive put in stack
                s.push(i);
            }else{//then check
                while(!s.isEmpty() && s.peek()>0 && s.peek()<i*-1){//stack value is positive and its less then current i then pop
                    s.pop();
                }
                if(!s.isEmpty() && s.peek()== i*-1){//curr stack val is equal to i then pop
                    s.pop();
                }
                else if(!s.isEmpty() && s.peek() >= -1*i)//curr stack val is > to i then do nothing
                continue;
                else{//it means first stack values is negitive
                    s.push(i);
                }

            }
        }
        int n=s.size();
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i]=s.pop();
        }
        return ans;
    }
}