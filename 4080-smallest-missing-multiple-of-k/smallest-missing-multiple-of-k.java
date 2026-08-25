class Solution {
    public int missingMultiple(int[] nums, int k) {
       List<Integer>list=new ArrayList<>();
       for(int i:nums){
        list.add(i);
       }int sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=k;
        if(!list.contains(sum)){
            return sum;
        }
       }return sum+k;
    }
}