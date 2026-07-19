class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
     for(String a:s){
        String [] b=a.split(" ");
        max=Math.max(b.length,max);
     }return max;   
    }
}