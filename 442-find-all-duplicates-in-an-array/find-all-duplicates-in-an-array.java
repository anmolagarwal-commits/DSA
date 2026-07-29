class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result= new ArrayList<>();
        int[] freq=new int[1000000];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]==2){
                result.add(nums[i]);
            }
            freq[nums[i]]--;
        }
        return result;
    }
}