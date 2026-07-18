class Solution {
    public int countGoodSubstrings(String s) {
        int c=0,start=0;
    //    HashSet<Character>set=new HashSet<>();
    //    for(int i=0;i<s.length();i++){
    //     while(set.contains(s.charAt(i))||set.size()==3){
    //         set.remove(s.charAt(start++));
    //     }
    //     set.add(s.charAt(i));
    //     if(set.size()==3){
    //         c++;
    //     }
        
    //    }return c;
int d=0;
    for(int i=0;i<=s.length()-3;i++){
        if(s.charAt(i)!=s.charAt(i+1)&&s.charAt(i)!=s.charAt(i+2)&&s.charAt(i+2)!=s.charAt(i+1)){
            d++;
        }
    }return d;
}
}