class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
       int sum=0;int f=0;
       for(int i=0;i<nums.length;i++){
        sum+=k;
        for(int j=0;j<nums.length;j++){
            if(sum==nums[j]){
                f++;
                break;
            }
        }if(f==0){
            return sum;
        }f=0;
       }return sum+k;
    }
}