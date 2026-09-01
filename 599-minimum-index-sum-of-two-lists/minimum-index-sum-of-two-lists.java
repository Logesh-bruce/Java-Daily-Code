class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int sum=0;
        ArrayList<String>list=new ArrayList<>();
        int min=Integer.MAX_VALUE;;
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    sum=i+j;
                       map.put(list1[i],sum);
                       if(sum<min){
                        min=sum;
                       }
                }
                
            }
        }
        for(String a:map.keySet()){
          if(map.get(a)==min)
         list.add(a);
        }int d=0;
        String[] val=new String[list.size()];
        for(String z:list){
            val[d++]=z;
        }return val;
    }
}