class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();

        call(list,new ArrayList<>(),new boolean[10],nums);
        return list;
    }
    public void call(List<List<Integer>>list,List<Integer>demo,boolean[]valid,int[]nums){
        if(demo.size()==nums.length){
            list.add(new ArrayList<>(demo));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!valid[i]){
                valid[i]=true;
            demo.add(nums[i]);
            call(list,demo,valid,nums);
            demo.remove(demo.size()-1);
            valid[i]=false;
            }
        }
    }
}