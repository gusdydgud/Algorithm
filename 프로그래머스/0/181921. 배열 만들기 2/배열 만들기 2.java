import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
         List<Integer> list = new ArrayList<>();
        
        for (int num = l; num <= r; num++) {
            if (ck(num)) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - i - 1; j++) {
                if (answer[j] > answer[j + 1]) {
                    int tem = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = tem;
                }
            }
        }
        
        return answer;
    }

    private boolean ck(int num) {
        while (num > 0) {
            int i = num % 10;
            if (i != 0 && i != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}