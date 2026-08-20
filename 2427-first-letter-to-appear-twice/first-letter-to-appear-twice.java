class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char a:s.toCharArray()){
         map.put(a,map.getOrDefault(a,0)+1);
         if(map.get(a)>1){
            return a;
         }
        }return 'a';
    
       
    }
}