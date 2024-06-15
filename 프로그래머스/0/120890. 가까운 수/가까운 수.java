import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0] - n);

        for (int num : array) {
            int d = Math.abs(num - n);
            if (d < min) {
                min = d;
                answer = num;
            } else if (d == min && num < answer) {
                answer = num;
            }
        }

        return answer;
    }
}