class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }int max=0;
        for(Integer value:map.values()){
            if(max<value){
                max=value;
            }
        }int sum=0;
        for(Integer values:map.values()){
            if(max==values){
                sum+=values;
            }
        }return sum;
    }
}