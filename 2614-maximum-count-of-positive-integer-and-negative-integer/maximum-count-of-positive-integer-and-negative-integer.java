class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        // int low=0;
        // int high=n-1;
        // int nonNegative=-1;
        // while(low<=high){
        //     int mid=low+(low+high)/2
        // }
        int negative=0;
        int positive=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                negative++;
            }else if(nums[i]>0){
                positive++;
            }
        }if(positive<negative){
            return negative;
        }else {
            return positive;
        }
    }
}