class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int r = attacks.length; // 공격 개수
        int healcnt = 0; // 연속 힐링 카운트
        int attackcnt = 0; // 현재 공격 인덱스
        int healm = health; // 최대 체력

        for (int i = 0; i <= attacks[r - 1][0]; i++) { // 마지막 공격 시간까지 진행
            if (attackcnt < r && i == attacks[attackcnt][0]) { // 공격 시간 도달
                health -= attacks[attackcnt][1]; // 피해 입힘
                attackcnt++; // 다음 공격으로 이동
                healcnt = 0; // 공격 받으면 연속 힐링 초기화
            } else { // 공격이 없는 경우
                if (healcnt == bandage[0]-1) { // 연속 힐링 완료 시 추가 회복
                    health += bandage[2] + bandage[1];
                    healcnt = 0; // 다시 힐링 시작
                } else { // 일반 힐링
                    health += bandage[1];
                    healcnt++;
                }
            }

            // 체력 초과 방지
            if (health > healm) {
                health = healm;
            } else if (health <= 0) { // 체력이 0 이하가 되면 종료
                return -1;
            }
        }
        answer = health;
        return answer;
    }
}
