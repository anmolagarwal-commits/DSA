class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            int minnum=nums[i];
            int maxnum=nums[i];
            for(int j=i;j<n;j++){
                minnum=Math.min(nums[j],minnum);
                maxnum=Math.max(nums[j],maxnum);
                sum+= maxnum-minnum;
            }
        }return sum;
    }
}