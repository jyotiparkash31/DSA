class Solution {
    public int minimumRounds(int[] tasks) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        //for traversing ket ansd value by using getValue and getKey()
         // using keySet() for iteration over keys
        // for (datatype name : gfg.keySet())
        // for (datatype url : gfg.values())
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            if(ent.getValue()<=1) return -1;
            else{
                  //if you have to find min no. of times we have to do such operation to get to the ending point
                if(ent.getValue()%3==0)
                    count+=ent.getValue()/3;
                else
                    count+=(ent.getValue()/3)+1;
                  
                // count+=ent.getValue()/3;
                // if(ent.getValue() %3!=0)
                //     count++;
            }
        }
        return count;
    }
}