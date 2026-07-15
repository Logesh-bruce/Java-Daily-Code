class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>=target){
                min=Math.min(end-start+1,min);
                sum-=nums[start++];
                
            }end++;
            
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }return min;
    }
}