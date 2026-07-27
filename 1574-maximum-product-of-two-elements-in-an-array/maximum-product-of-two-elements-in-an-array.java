class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++)
        //     product=(nums[i]-1)*(nums[j]-1);
        //     if(max<product){
        //         max=product;
        //     }
        // }
        int product=(nums[n-1]-1)*(nums[n-2]-1);
        return product;
    }
}