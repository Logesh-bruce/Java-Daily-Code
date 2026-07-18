class Solution {
    public int totalFruit(int[] arr) {
        int max=0,start=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
            while(map.size()>2){
                map.put(arr[start],map.get(arr[start])-1);
                if(map.get(arr[start])==0){
                    map.remove(arr[start]);
                }start++;
            }
           max=Math.max(max,i-start+1);
            }
        return max;
    }
}