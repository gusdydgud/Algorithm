import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue=new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<progresses.length;i++){
            int day = (int)Math.ceil((100.0-progresses[i])/speeds[i]);
            queue.add(day);
        }
        while(!queue.isEmpty()){
            int deploy = queue.poll();
            int cnt=1;
            while(!queue.isEmpty()&&queue.peek()<=deploy){
                queue.poll();
                cnt++;
            }list.add(cnt);
        }
        int[] answer= new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
       
        
        return answer;
    }
}