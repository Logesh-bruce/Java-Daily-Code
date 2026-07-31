class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i:nums){
         if(i<min){
            min=i;
         }else if(max<i){
            max=i;
         }

        }return gcds(max,min);
    }
    static int gcds(int max,int min){
        while(max!=0){
            int temp=max;
            max=min%max;
            min=temp;
        }return min;
    }
}