class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k)- atMost(nums, k-1);
    }
    public int atMost(int[] nums, int k){
        if(k<0) return 0;
        int left=0;
        int odd=0;
        int cnt=0;
        int n=nums.length;
        for(int right=0; right<n; right++){
            if(nums[right]%2==1){
                odd++;
            }
            while(odd>k){
                if(nums[left]%2==1){
                    odd--;
                }
                left++;
            }
            cnt+=right-left+1;
        }
        return cnt;
    }
}