class Solution {
    public int mostFrequentEven(int[] nums) {
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            
            }
        }
       int i=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int freq=entry.getValue();
            int num=entry.getKey();
            if(max<freq){
                max=freq;
                i=num;
            }else if(max==freq&&i>num){
                max=freq;
                i=num;
            }
        }
        if(map.isEmpty()){
            return -1;
        }return i;
    }
}