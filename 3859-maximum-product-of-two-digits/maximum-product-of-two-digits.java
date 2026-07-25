class Solution {
    public int maxProduct(int n) {
    String a=String.valueOf(n);
    int arr[]=new int[a.length()];
    for(int i=0;i<a.length();i++){
       arr[i]=a.charAt(i)-'0';
    }int sum=1;
    int max=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
       sum=arr[i]*arr[j];
       max=Math.max(sum,max);
        }
    }return max;
    }
}