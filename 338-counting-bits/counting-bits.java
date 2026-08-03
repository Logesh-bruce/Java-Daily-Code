class Solution {
    public int[] countBits(int d) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        int c=0;
        int n=0;
        for(int i=1;i<=d;i++){
            c=0;
            n=i;
            while(n>0){
            if((n&1)==1) c++;
            n>>=1;
            }list.add(c);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }return arr;
    }
}