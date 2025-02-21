import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        for(int i =0;i<answers.length;i++){
            if(answers[i]==answer1[i%5]){
                cnt1++;
            }
            if(answers[i]==answer2[i%8]){
                cnt2++;
            }
            if(answers[i]==answer3[i%10]){
                cnt3++;
            }
        }
        // 최고 점수 찾기
        int maxScore = Math.max(cnt1, Math.max(cnt2, cnt3));

        // 고득점자 저장
        ArrayList<Integer> topScorers = new ArrayList<>();
        if (cnt1 == maxScore) topScorers.add(1);
        if (cnt2 == maxScore) topScorers.add(2);
        if (cnt3 == maxScore) topScorers.add(3);

        // ArrayList → 배열 변환 (스트림 없이)
        int[] answer = new int[topScorers.size()];
        for (int i = 0; i < topScorers.size(); i++) {
            answer[i] = topScorers.get(i);
        }

        return answer;
    }
}