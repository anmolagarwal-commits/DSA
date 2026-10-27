class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        int [] arr=new int[10];
        int dig1=n;
        while(n>0){
            int dig=n%10;
            n=n/10;
            arr[dig]++;
        }
        for(int i=1;i<10;i++){
            sum=sum+arr[i]*i;
        }
        return sum;
    }
}