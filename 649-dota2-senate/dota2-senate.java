import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R=new LinkedList<>();
        Queue<Integer> D=new LinkedList<>();
        int n=senate.length();
        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R'){
                R.add(i);
            }
            else{
                D.add(i);
            }
        }
        while(!R.isEmpty() && !D.isEmpty()){
            int r=R.poll();
            int d=D.poll();
            if(r<d){
                R.add(r+n);
            }
            else{
                D.add(d+n);
            }
        }
        if(R.isEmpty()){
            return "Dire";
        }
        else{
            return "Radiant";
        }
    }
}