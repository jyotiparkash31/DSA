class Solution {
    //we can solve this by changing the all the ime into minutes
    public int convertTime(String current, String correct) {
        int count=0;
        String[] cu=current.split(":");
        String[] co=correct.split(":");
        int a=Integer.parseInt(cu[0]);
        int b=Integer.parseInt(cu[1]);
        int x=Integer.parseInt(co[0]);
        int y=Integer.parseInt(co[1]);
        if(y>=b ){
          while(a!=x){
           count++;
           a=a+1;
       }  
        }
           if(y<b){
               while(x-a>1){
                   a=a+1;
                   count++;
               }
           y=y+(60-b);
               b=0;
           }
          while(b!=y){
            if(y-b<5){
               b=b+1; 
                count++;
            }
            else if(y-b<15 && y-b>=5){
                b=b+5;
                count++;
            }
            else{
                b=b+15;
                count++;
            }
                
        }

        return count;
    }
}

//concept of greedy approch
  // int diff = getTime(correct) - getTime(current), ops[4] = {60,15,5,1}, ans = 0;
  //       for (int op : ops) {
  //           ans += diff / op;
  //           diff %= op;
  //       }
  //       return ans;