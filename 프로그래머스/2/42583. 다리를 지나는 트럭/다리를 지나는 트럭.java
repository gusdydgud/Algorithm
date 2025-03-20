import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer>bridge=new LinkedList<>();
        int bridgeweight=0;
        int index=0;
        int answer = 0;
        for(int i=0;i<bridge_length;i++){
            bridge.add(0);
        }
        while(index<truck_weights.length||bridgeweight >0){
            answer++;
            bridgeweight-=bridge.poll();
            if(index<truck_weights.length&&bridgeweight+truck_weights[index]<=weight){
                bridge.add(truck_weights[index]);
                bridgeweight+=truck_weights[index];
                index++;
            }else{
                bridge.add(0);
            }
        }
        return answer;
    }
}