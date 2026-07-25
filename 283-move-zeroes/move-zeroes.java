class Solution {
    public void moveZeroes(int[] nums) {
       int posind=0;
       for(int num:nums){
        if(num!=0){
           nums[posind++]=num;
        }
       }while(posind<nums.length){
        nums[posind++]=0;
       }
    }
}