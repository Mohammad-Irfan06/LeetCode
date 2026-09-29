class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int ts=(1<<nums.length);
        for(int i=0; i<ts; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<nums.length; j++){
                if(checkBit(i,j)){
                    list.add(nums[j]);
                }
            }
            result.add(list);
        }
        return result;
    }
    public static boolean checkBit(int n, int i){
        return (n&(1<<i))!=0;
    }
}