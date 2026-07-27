class Solution {
    public String sortSentence(String s) {
       String []a=s.split(" ");
       String as[]=new String[a.length];
       String d="";
       for(int i=0;i<a.length;i++){
        String b=a[i];
        
        for(int j=0;j<b.length();j++){
            int c=b.length()-1;
            if(Character.isDigit(b.charAt(j))){
                int size=b.charAt(j)-'0';
             as[size-1]=b.substring(0,c);
            }
        }
       }for(String e:as){
            d+=e+" ";
       }return d.trim();
    }
}