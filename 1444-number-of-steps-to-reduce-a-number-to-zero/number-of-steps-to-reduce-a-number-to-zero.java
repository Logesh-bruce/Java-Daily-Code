class Solution {
    public int numberOfSteps(int num) {
        if(num==0){
            return 0;
        }
       return call(num,1);
    }
    public static int call(int num,int c){
        if(num==1){
            return c;
        }
        if(num%2!=0){
            num=num-1;
            c=c+1;
        }
       return call(num/2,c+1);
    }
}