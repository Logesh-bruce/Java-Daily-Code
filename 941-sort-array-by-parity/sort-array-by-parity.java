class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                list.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);   
        }int k=0;
        for(int i=list.size();i<nums.length;i++){
            nums[i]=list2.get(k++);
        }return nums;

    }
}