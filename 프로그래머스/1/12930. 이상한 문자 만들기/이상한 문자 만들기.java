import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();int index = 0; // 단어 내에서의 짝/홀 인덱스

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') { 
                // 공백이 나오면 index 초기화하고 그대로 추가
                index = 0;
                answer.append(c);
            } else {
                // 단어 내에서 짝수 번째 문자는 대문자로, 홀수 번째 문자는 소문자로 변환
                if (index % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                index++; // 공백이 아닐 때만 인덱스 증가
            }
        }

        return answer.toString();
    }
}