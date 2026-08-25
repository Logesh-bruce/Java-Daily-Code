class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>>list=new HashSet<>();
        List<List<Integer>> abs = new ArrayList<>();
         find(nums,new ArrayList<>(),list,0);
         abs.addAll(list);
         return abs;
    }
    public static void find(int[]nums,List<Integer>temp,Set<List<Integer>>list,int ind){
        if(ind==nums.length){
            if(temp.size()>=2){
               
            list.add(new ArrayList<>(temp));
               
            }
           return; 
        } int a=nums[ind];
     if(temp.size()==0||temp.get(temp.size()-1)<=a){
          
        temp.add(a);
        find(nums,temp,list,ind+1);
         temp.remove(temp.size()-1);
          find(nums,temp,list,ind+1);
     }else{
       
        find(nums,temp,list,ind+1);
     }
        
    }
}