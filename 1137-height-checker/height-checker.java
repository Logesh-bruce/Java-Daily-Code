class Solution {
    public int heightChecker(int[] heights) {
        int []bruce=heights.clone();
        int count=0;
        Arrays.sort(bruce);
        for(int i=0;i<bruce.length;i++){
            if(bruce[i]!=heights[i]){
                count++;
            }
        }return count;
    }
}