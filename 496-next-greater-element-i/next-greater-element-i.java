class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater=new int[10001];
        int[] stack=new int[nums2.length];
        int top=-1;
        for(int i=nums2.length-1;i>=0;i--){
            int current=nums2[i];
            while(top>=0 && stack[top]<=current){
                top--;
            }
            nextGreater[current]=(top==-1)?-1:stack[top];
            stack[++top]=current;
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=nextGreater[nums1[i]];
        }
        return res;
    }
}