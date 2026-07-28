class Solution {
    public boolean scoreBalance(String s) {
      
       int c=0;
int d=0;
       for(int i=0;i<s.length();i++){
        c+=s.charAt(i)-'a'+1;
       }
       for(int i=0;i<s.length();i++){
        d+=s.charAt(i)-'a'+1 ;
        c-=s.charAt(i)-'a'+1;
        if(d==c){
            return true;
        }
       }return false;



        }
    }
