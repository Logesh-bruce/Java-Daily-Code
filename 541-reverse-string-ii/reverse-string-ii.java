class Solution {
    public String reverseStr(String s, int k) {
      return check(s,k,0);
    }
    public static String check(String s,int k,int ind){
if(ind>=s.length()){
    return "";
}      
int end=Math.min(ind+k,s.length());
String rev=reverse(s.substring(ind,end));
String skip=s.substring(end,Math.min(ind+2*k,s.length()));
return rev+skip+check(s,k,ind+2*k);
    }public static String reverse(String s){
        if(s.length()==0){
            return "";
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
}