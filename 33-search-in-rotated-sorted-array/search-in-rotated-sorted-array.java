class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n-1, x = target;
        for(;l<=h;){
            int m = (l+h)/2;
            if(nums[m]==x) return m;
            if(nums[l]<=nums[m]){
                if(x>=nums[l] && x<nums[m]) h=m-1;
                else l = m+1;
            }
            else{
                if(x>nums[m] && x<=nums[h]) l=m+1;
                else h = m-1;
            }
        }
        return -1;
    }
}