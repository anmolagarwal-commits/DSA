class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        int power=0;
        int n=columnTitle.length();
        for(int i=n-1;i>=0;i--){
            int temp=columnTitle.charAt(i)-'A'+1;
            int b=(int)Math.pow(26,power)*temp;
            sum=sum+b;
            // sum=sum+Math.pow(26,power)*temp;
            power++;
        }
        return sum;
    }
}