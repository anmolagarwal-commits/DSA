class Solution {
    public int minPartitions(String n) {
        int len=n.length();
        int max=0;
        for(int i=0;i<len;i++){
            int m=n.charAt(i)-'0';
            if(max<m){
                max=m;
            }
        }
        return max;
    }
}