class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int ls=0;
        int rs=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            rs=sum-ls-nums[j];
            if(ls==rs){
                return j;
            }
            ls+=nums[j];
        }
        return -1;
    }
}