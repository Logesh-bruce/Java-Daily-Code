class Solution {
    public String removeOccurrences(String s, String part) {
    return bruce(s,part);

    }
    public static String bruce(String s,String part){
      
      if(s.indexOf(part)==-1){
        return s;
      }
     
     int index=s.indexOf(part);
     String before=s.substring(0,index);
     String after=s.substring(index+part.length());
    
return bruce(before+after,part);
      
    }
}