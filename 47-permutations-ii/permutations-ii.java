class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        call(nums,list,new ArrayList<>(),new boolean[nums.length]);
        
        return list;
    }
    public void call(int[]nums,List<List<Integer>>list,List<Integer>demo,boolean[]valid){
      if(demo.size()==nums.length){
            list.add(new ArrayList<>(demo));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(valid[i])continue;
            if(i>0&&!valid[i-1]&&nums[i]==nums[i-1]) continue;

                valid[i]=true;
            demo.add(nums[i]);
            call(nums,list,demo,valid);
            demo.remove(demo.size()-1);
            valid[i]=false;
            
        }
    }
}