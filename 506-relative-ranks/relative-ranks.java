class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[]sample=score.clone();
        Arrays.sort(sample);
        HashMap<Integer,String>map=new HashMap<>();
        if(sample.length>=1){
        map.put(sample[sample.length-1],"Gold Medal");
        }
        if(sample.length>=2){
        map.put(sample[sample.length-2],"Silver Medal");
        }
        if(sample.length>=3){
        map.put(sample[sample.length-3],"Bronze Medal");
        }
        for(int i=sample.length-4;i>=0;i--){
            
            map.put(sample[i],String.valueOf(sample.length-i));
        }int k=0;
        String []value=new String[score.length];
       for(int i=0;i<score.length;i++){
        value[k++]=map.get(score[i]);
       }


       return value;
    }
}