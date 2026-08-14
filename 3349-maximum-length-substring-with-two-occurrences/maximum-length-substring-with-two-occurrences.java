class Solution {
    public int maximumLengthSubstring(String s) {
        int start=0;int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      map.put(ch,map.getOrDefault(ch,0)+1);
      while(map.get(ch)>2){
        char c=s.charAt(start);
        map.put(c,map.get(c)-1);
       
        if(map.get(c)==0){
            map.remove(c);
        } start++;
      }
count=Math.max(i-start+1,count);

      }return count;  
    }
}