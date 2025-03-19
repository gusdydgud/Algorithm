import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int s : tangerine){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<Integer> cnt = new ArrayList<>(map.values());
        cnt.sort(Collections.reverseOrder());
        int total =0;
        int types =0;
        for(int c:cnt){
            total+=c;
            types++;
            if(total>=k){
                return types;
            }
        }
        return types;
    }
}