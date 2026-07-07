public class Solution {
    public long SumAndMultiply(int n) {
        long sum=0;long rev=0;
        while(n!=0){
            
            int digit=n%10;
            if(digit!=0){
            sum+=digit;
            rev=rev*10+digit;
            }
            n/=10;
        }
        long a=0;
        while(rev!=0){
            long z=rev%10;
            a=a*10+z;
            rev/=10;
        }return a*sum;
    }
}