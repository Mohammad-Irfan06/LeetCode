class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max_cnt=0;
        int curr_cnt=0;
        for(int j=0; j<n; j++){
            if(nums[j]==1){
                curr_cnt++;
            }
            else{
                max_cnt = Math.max(max_cnt, curr_cnt);
                curr_cnt=0;
            }
        }
        return max_cnt = Math.max(max_cnt, curr_cnt);
    }
}