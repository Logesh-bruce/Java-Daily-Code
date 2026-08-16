class Solution {
    public int numberOfSteps(int num) {
       
       return call(num);
    }
    public static int call(int num){
         if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        if(num%2==0){
            return 1+call(num/2);
        }
        return 2+call((num-1)/2);
    }
}