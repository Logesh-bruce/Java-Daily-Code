class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        rev(s,left,right);
    }
    static char[] rev(char []s,int left,int right){
           if(left>=right){
            return s;
           }
           char temp=s[left];
           s[left]=s[right];
           s[right]=temp;

           rev(s,left+1,right-1);
           return s;
           
    }
}