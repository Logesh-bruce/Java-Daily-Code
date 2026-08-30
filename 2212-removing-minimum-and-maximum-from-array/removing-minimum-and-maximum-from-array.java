class Solution {
    public int minimumDeletions(int[] nums) {
        int min=nums[0],max=nums[0];
        int ind=0,ind2=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];ind=i;
            }else if(min>nums[i]){
                min=nums[i];ind2=i;
            }
        }
    int left=Math.min(ind,ind2);
    int right=Math.max(ind,ind2);
   int removeFront=right+1;
   int removeBack=nums.length-left;
   int removeBoth=(left+1)+(nums.length-right);
   return Math.min(removeFront,Math.min(removeBack,removeBoth));

    }
}