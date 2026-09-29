class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        int i=0;
        int count=0;
        for(int student: students){
            q.add(student);
        }
        while(!q.isEmpty()){
            int student=q.poll();
            if(student==sandwiches[i]){
                i++;
                count=0;
            }
            else{
                q.add(student);
                count++;
            }
            if(count==q.size()){
                return q.size();
            }
        }
        return 0;
    }
}