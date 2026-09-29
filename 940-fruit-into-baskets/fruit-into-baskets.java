class Solution {
    public int totalFruit(int[] fruits) {
    int n=fruits.length;
    HashMap<Integer,Integer>map=new HashMap<>();
    int left=0;
    int maxlen=0;

    for(int r=0;r<n;r++){
        map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
        while(map.size()>2){
            map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
            if(map.get(fruits[left])==0){
                map.remove(fruits[left]);
            }
            left++;

        }
        maxlen=Math.max(maxlen,r-left+1);
    }    
    return maxlen;
    }
}