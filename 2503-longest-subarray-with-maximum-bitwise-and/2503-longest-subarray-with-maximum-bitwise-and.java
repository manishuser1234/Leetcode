class Solution {
    public int longestSubarray(int[] nums) {
        int result=1,curr=1,max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                curr=1;
                result=1;
                max=nums[i];
            }else if(nums[i]==max){
                curr++;
                result=Math.max(result,curr);
            }else{
                curr=0;
            }
        }
        return result;
    }
}