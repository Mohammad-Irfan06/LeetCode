class Solution {
public static int getExactK(int [] nums,int k){
    if(k<0) return 0;
    int n=nums.length;
    int left=0;
    int cnt=0;
    int sum=0;
    for(int right = 0;right<n;right++){
        sum+=nums[right];
        while(sum>k){
            sum-=nums[left];
            left++;
        }
        cnt+=(right-left+1);
    }
    return cnt;
}
    public int numSubarraysWithSum(int[] nums, int goal) {
       return getExactK(nums,goal)-getExactK(nums,goal-1);
    }
}