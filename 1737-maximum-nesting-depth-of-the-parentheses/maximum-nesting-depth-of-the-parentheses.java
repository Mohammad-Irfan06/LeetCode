class Solution {
    public int maxDepth(String s) {
        Stack <Character>stack=new Stack<>();
        int maxDeapth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
                maxDeapth=Math.max(maxDeapth,stack.size());
            }
            else if(ch==')'){
                stack.pop();
            }
           
        }
        return maxDeapth;
    }
}