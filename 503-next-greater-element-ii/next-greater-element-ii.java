class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        if(nums.length==1){
            arr[0]=-1;
            return arr;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+i;j++){
                int k=j%n;
                if(nums[i]<nums[k]){
                    arr[i]=nums[k];
                    break;
                }else{
                    arr[i]=-1;
                }
            }
        }
        return arr;
}
}