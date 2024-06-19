import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                i++;
            } else {
                if (stk.peek() == arr[i]) {
                    stk.pop();
                    i++;
                } else {
                    stk.push(arr[i]);
                    i++;
                }
            }
        }
        if (stk.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        
        return answer;
    }
}